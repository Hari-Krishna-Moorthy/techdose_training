// URL : https://leetcode.com/problems/spiral-matrix/

import java.util.ArrayList;
import java.util.List;

class SpiralOrder {
	static public List<Integer> spiralOrder(int[][] matrix) {
        int dir = 0;
        List<Integer> res = new ArrayList<Integer>();
        
        int top = 0, bottom = matrix.length-1;
        int left = 0, right = matrix[0].length-1;
        
        while(left <= right && top <= bottom) {
        	dir++;
        	if(dir%5 == 0) {
        		dir=1;
        	}

            if(dir == 1) {
            	for(int i=left;i<=right;i++)
            	    res.add(matrix[top][i]);
            	top++;
            }else if(dir==2) {
            	for(int i=top;i<=bottom;i++)
            	    res.add(matrix[i][right]);
            	right--;
            }else if(dir==3) {
            	for(int i=right;i>=left;i--)
            	    res.add(matrix[bottom][i]);
            	bottom--;
            }else if(dir==4) {
            	for(int i=bottom;i>=top;i--)
            	    res.add(matrix[i][left]);
            	left++;           
            }

        }
        return res;
    }	

    public static void main(String[] args) {
    	System.out.println(spiralOrder(new int[][] {{1,2,3},{4,5,6},{7,8,9}} ));
    	System.out.println(spiralOrder(new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12}}));
    }
}