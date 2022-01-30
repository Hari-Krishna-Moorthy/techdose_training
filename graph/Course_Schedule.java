import java.util.Vector;

class Course_Schedule {
	public static boolean isCycle(Vector<Vector<Integer>> adj, Vector<Integer> visited, int curr) {
		if(visited.get(curr) == 2) return true;

		visited.set(curr,2);

		for(Integer node : adj.get(curr)) {
			if(visited.get(node) != 1) {
				if(isCycle(adj, visited, node)) return true;
			}
		}
		visited.set(curr, 1);
		return false;
	}

	public static boolean canFinish(int numCourses, int[][] prerequisites) {
    	
    	Vector<Vector<Integer>> adj = new Vector<>();
    	Vector<Integer> visited = new Vector<>();

    	for(int i=0;i<numCourses;i++) {
    		adj.add(new Vector<Integer>());
    		visited.add(0);
    	}

    	for(int[] prerequisite : prerequisites) {
    		adj.get(prerequisite[0]).add(prerequisite[1]);
    	}
    	// System.out.println(isCycle(adj, visited, 5));
    	for(int i=0;i<numCourses;i++) {
    		// System.out.println( adj);
    		System.out.println(isCycle(adj, visited, i) + " " + visited.get(i));
    		if(visited.get(i) == 0) {
    			if(isCycle(adj, visited, i)) return false;
    		}
    	}
    	return true;
    }

	public static void main(String[] args) {

		// System.out.println(canFinish(2, new int[][] {{1, 0}} ));
		// System.out.println(canFinish(2, new int[][] {{1, 0}, {0, 1}} ));
		System.out.println(canFinish(20, new int[][] {{0,10},{3,18},{5,5},{6,11},{11,14},{13,1},{15,1},{17,4}} ));

	}
}

