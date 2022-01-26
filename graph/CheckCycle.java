import java.util.Vector;

class CheckCycle {
	public static boolean isCycle(Vector<Vector<Integer>> adj, Vector<Integer> visited, int curr) {
		if(visited.get(curr) == 2) return true;

		visited.add(curr,2);

		for(Integer node : adj.get(curr)) {
			if(visited.get(node) != 1) {
				if(isCycle(adj, visited, node)) return true;
			}
		}
		visited.add(curr, 1);
		return false;
	}

	public static void main(String[] args) {

		Vector<Vector<Integer>> adj = new Vector<>();
		Vector<Integer> visited = new Vector<Integer>();
		int len = 3;
		for(int i=0;i<len;i++) {
			adj.add(new Vector<Integer>());	
			visited.add(-1);
		}

		adj.get(0).add(1);	
		adj.get(1).add(2);	
		adj.get(2).add(0);	

		System.out.println(isCycle(adj, visited, 0));
	}
}