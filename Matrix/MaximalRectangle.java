// URL : https://leetcode.com/problems/maximal-rectangle/

import java.util.Stack;

class MaximalRectangle {
	static public int maximalRectangle(char[][] matrix) {
        if(matrix.length==0 && matrix[0].length==0) 
            return 0;
        int r = matrix.length, c = matrix[0].length;
        int[][] mat_temp = new int[r+1][c], dp = new int[r+1][c];

        for(int i=1;i<=r;i++) {
            for(int j=0;j<c;j++) {
                mat_temp[i][j] = matrix[i-1][j] == '1'?1:0;
            }
        }

        int mx = 0;

        for(int i=1;i<=r;i++) {
            int left = -1;
            Stack<Integer> stk = new Stack<Integer>();
            int[] leftArray = new int[c];

            for(int j=0;j<c;j++) {
                if(mat_temp[i][j]==1) {
                    mat_temp[i][j] = 1+mat_temp[i-1][j];
                    while(!stk.empty() && mat_temp[i][stk.peek()]>=mat_temp[i][j])
                        stk.pop();
                    int val = left;
                    if(!stk.empty())
                        val = Math.max(val, stk.peek());
                    leftArray[j] = val;
                } else {
                    left = j;
                    leftArray[j] = 0;
                }
                stk.push(j);
            }
        
            while(!stk.empty())
                stk.pop();

            int right = c;

            for(int j=c-1;j>=0;--j) {
                if(mat_temp[i][j] !=0) {
                    while(!stk.empty() && mat_temp[i][stk.peek()]>=mat_temp[i][j])
                        stk.pop();
                    int val = right;
                    if(!stk.empty())
                        val = Math.min(val, stk.peek());
                    dp[i][j] = mat_temp[i][j] * ((val-1) - (leftArray[j]+1)+1);
                    mx = Math.max(mx, dp[i][j]);
                    stk.push(j);
                } else {
                    dp[i][j] = 0;
                    right = j;
                }
            } 

        }
        return mx;
    }
    public static void main(String[] args) {
        System.out.println(maximalRectangle(new char[][] {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}})); // 6
        System.out.println(maximalRectangle(new char[][] {{'0'}})); // 0
    	System.out.println(maximalRectangle(new char[][] {{'1'}})); // 0
    }
}