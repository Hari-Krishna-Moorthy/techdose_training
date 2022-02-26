// URl : https://leetcode.com/problems/possible-bipartition/


import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

class Possible_bipartition {

	static private Map<Integer, LinkedList<Integer>> adj = null;
	static private int[] visited = null;

	static public boolean dfs(int node, int color) {
		if(visited[node] !=0 && visited[node]!=color) return false;
		if(visited[node]==color) return true;
		visited[node] = color;
		if(adj.get(node)==null) return true;

		for(int neigh:adj.get(node)) {
			if(!dfs(neigh, -color)) return false;
		}
		return true;
	}
	static public boolean possibleBipartition(int n, int[][] dislikes) {
		adj = new HashMap<>();
		visited = new int[n+1];

		for(int[] dislike : dislikes) {
			if(!adj.containsKey(dislike[0])) 
				adj.put(dislike[0], new LinkedList<>());

			if(!adj.containsKey(dislike[1])) 
				adj.put(dislike[1], new LinkedList<>());
			adj.get(dislike[0]).add(dislike[1]);
			adj.get(dislike[1]).add(dislike[0]);
		}

		for(int i=0;i<n;i++) {
			if(visited[i]==0) {
				if(!dfs(i, 1)) return false;
			} 
		}
		return true;

	}

	public static void main(String[] args) {
		System.out.println(possibleBipartition(4, new int[][] {{1,2}, {1,3}, {2,4}, }));	
		System.out.println(possibleBipartition(4, new int[][] {{1,2}, {1,3}, {2,3}, }));	
		System.out.println(possibleBipartition(5, new int[][] {{1,2},{2,3},{3,4},{4,5},{1,5}} ));
	}
}


/*

STEP 1 : make a adj list.
STEP 2 : if there is no odd length cycle 
				then graph is bipartial 

		it will be possible to separate incompleter person in 2 diff SET



		USE GRAPH COLOR
		

*/