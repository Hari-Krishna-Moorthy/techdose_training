// URL : https://leetcode.com/problems/unique-binary-search-trees/

class UniqueBinarySearchTrees {

	static public int numTrees(int n) {
        int[] catalan = new int[n+1];

		catalan[0] = 1;
		catalan[1] = 1;

		for(int x=2;x<n+1;x++) {
			for(int y=0;y<x;y++) {
				catalan[x] += catalan[y] * catalan[x - y - 1];
			}
		}
		return catalan[n];

    }

	public static void main(String[] args) {
		System.out.println(numTrees(1));
		System.out.println(numTrees(3));
	}
}