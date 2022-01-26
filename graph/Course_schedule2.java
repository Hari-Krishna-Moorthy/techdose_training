import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Arrays;

class Course_schedule2 {

	public static boolean isCycle(List<List<Integer>> adj, List<Integer> visited, Integer v) {
		if(visited.get(v) == 2) return true;
		if(visited.get(v) == 1) return false;

		visited.set(v, 2);

		for(Integer vertex : adj.get(v)) {
			if(isCycle(adj, visited, vertex)) return true;
		}

		visited.set(v, 1);
		return false;

	}

	public static boolean detectCycle(List<List<Integer>> adj, int  noof_vertex) {
        List<Integer> visited = new ArrayList<Integer>();

        for(int i=0;i<noof_vertex;i++) {
        	visited.add(0);
        }



        for(int i=0;i<noof_vertex;i++) {
        	if(visited.get(i) == 0) {
				if(isCycle(adj, visited, i)) return true;        		
        	}
        }
        return false;
	}

	public static void dfs(List<List<Integer>> adj, int v, List<Boolean> visited, Stack<Integer> stk) {
		visited.set(v, true);
		for(Integer vertex : adj.get(v)) {
			if(!visited.get(vertex)) {
				dfs(adj, vertex, visited, stk);
			}
		}		
		stk.push(v);
	}

	public static int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<List<Integer>>();
		Stack<Integer> stk = new Stack<Integer>();
        List<Boolean> visited = new ArrayList<Boolean>();

        for(int i=0;i<numCourses;i++) {
        	adj.add(new ArrayList<Integer>());
        	visited.add(false);
        }
        for(int[] prerequisite : prerequisites) {
        	adj.get(prerequisite[0]).add(prerequisite[1]);
        }

        if(detectCycle(adj, numCourses)) 
        	return new int[] {};



        for(int i=0;i<numCourses;i++) {
        	if(!visited.get(i)) 
        		dfs(adj, i, visited, stk);
        }

        int[] res = new int[stk.size()];
        int resInd = res.length-1;

        while(!stk.empty()) {
        	res[resInd--] = stk.peek();
        	stk.pop();
        }
        return res;
    }

    public static void main(String[] args) {
    	System.out.println(
    		Arrays.toString(findOrder(2, new int[][] {{1, 0}}))
    		);

    	System.out.println(
    		Arrays.toString(findOrder(4, new int[][] {{1, 0}, {2, 0}, {3, 1}}))
    		);

    	System.out.println(
    		Arrays.toString(findOrder(1, new int[][] {}))
    		);

    	System.out.println(
    		Arrays.toString(findOrder(2, new int[][] {{0, 1}, {1, 0}}))
    		);

    }
}