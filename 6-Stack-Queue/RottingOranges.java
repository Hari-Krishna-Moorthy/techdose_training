// URL : https://leetcode.com/problems/rotting-oranges/submissions/

import java.util.Arrays;
import java.util.Queue;
import java.util.LinkedList;

class RottingOranges {
	static public void fillNearby(int i, int j, int[][] grid, Queue<Integer[]> q) {
        if(i<0|| j<0 || i>=grid.length || j>=grid[0].length || grid[i][j] != 1)
            return ;
        grid[i][j] = 2;
        q.add(new Integer[] {i, j});
    }
    static public int orangesRotting(int[][] grid) {
        if(grid.length==0 && grid[0].length==0) 
            return -1;
        Queue<Integer[]> queue = new LinkedList<Integer[]>();
        int total = 0;        
        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[0].length;j++) {
                if(grid[i][j] != 0) total++;
                if(grid[i][j] == 2) queue.add(new Integer[] {i, j});
            }
        }
        
        int count = 0, min = 0; 
        while(!queue.isEmpty()) {
            int k = queue.size();

            count += k;
            while(k-- > 0) {
                int x = queue.peek()[0], y = queue.peek()[1];
                queue.remove();
                fillNearby(x-1, y, grid, queue);
                fillNearby(x+1, y, grid, queue);
                fillNearby(x, y-1, grid, queue);
                fillNearby(x, y+1, grid, queue);                
            }
            if(!queue.isEmpty())min++;
        }
        System.out.println("Count : " + count + " Total : " + total + " Mins : " + min);
        System.out.println("Grid : ");

        for(int[] arr : grid)
            System.out.println(Arrays.toString(arr));

        return count==total? min : -1;
    }
    public static void main(String[] args) {
    	System.out.println(orangesRotting(new int[][] {{2,1,1},{1,1,0},{0,1,1}}));
    	System.out.println(orangesRotting(new int[][] {{2,1,1},{0,1,1},{1,0,1}}));
    	System.out.println(orangesRotting(new int[][] {{0,2}}));
    }
}