import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class IsGraphBipartite {
    static private Map<Integer, LinkedList<Integer>> adj = null;
	static private int[] visited = null;
	static private boolean dfs(int node, int color) {
		if(visited[node]!=0 && visited[node]!=color) return false;
		if(visited[node]==color) return true;
		visited[node] = color;

		if(adj.get(node)==null) return true;

		for(int neigh: adj.get(node)) {
			if(!dfs(neigh, -color)) return false; 
		}
		return true;
	}

    static public boolean isBipartite(int[][] graph) {
        int rowInd = 0;
        adj = new HashMap<>();
        for (int[] row : graph) {
            adj.put(rowInd, new LinkedList<Integer>());
            for (int edge : row) {
                adj.get(rowInd).add(edge);
            }
            rowInd += 1;
        }
        visited = new int[rowInd];

        for (int i = 0; i < rowInd; i++) {
            if (visited[i] == 0) {
                if (!dfs(i, 1))
                    return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(isBipartite(new int[][] {{1,3},{0,2},{1,3},{0,2}}));
        System.out.println(isBipartite(new int[][] {{1,2,3},{0,2},{1,3},{0,2}}));
    }
}