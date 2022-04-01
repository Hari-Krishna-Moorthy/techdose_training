// URL : https://leetcode.com/problems/lru-cache/

import java.util.Arrays;
import java.util.Stack;

class LargestRectangleinHistogram {
	static public int largestRectangleArea(int[] heights) {
        int[] left = new int[heights.length];
        int[] right = new int[heights.length];
        Stack<Integer> stk = new Stack<Integer>();
        
        for(int i=0;i<heights.length;i++) {
            if(stk.empty()) {
                left[i] = 0;  
                stk.push(i);       
            } else {
                while(!stk.empty() && heights[stk.peek()] >= heights[i]) 
                    stk.pop();
                if(stk.empty()) left[i] = 0;
                else left[i] = stk.peek()+1;
                stk.push(i);
            }
        }
        while(!stk.empty()) stk.pop();
        
        for(int i=heights.length-1;i>=0;i--) {
            if(stk.empty()) {
                right[i] = heights.length-1;        
            } else {
                while(!stk.empty() && heights[stk.peek()] >= heights[i]) 
                    stk.pop();
                if(stk.empty()) right[i] = heights.length-1;
                else right[i] = stk.peek()-1;
            }
            stk.push(i);
        }
        // System.out.println(Arrays.toString(left) + " " + Arrays.toString(right));
        int max=0;
        for(int i=0;i<heights.length;i++) {
            max = Math.max(heights[i] * (right[i]-left[i]+1), max);
        }
        return max;
    }
    public static void main(String[] args) {
    	System.out.println(largestRectangleArea(new int[] {2, 4}));
    	System.out.println(largestRectangleArea(new int[] {1, 1}));
    	System.out.println(largestRectangleArea(new int[] {2, 1, 5, 6, 2, 3}));
    }
}