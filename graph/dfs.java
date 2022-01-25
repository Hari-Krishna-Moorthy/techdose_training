import java.util.Scanner;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


class dfs {
	
	public static void dfs_fun1(int s, List<LinkedList<Integer>> g, boolean[] vis) {
		
		System.out.print(s + " ");
		vis[s] = true;

		for(Integer edge : g.get(s) ) {
			if(vis[edge] == false) 
				dfs_fun1(edge, g, vis);
		}

	}
	public static void dfs_fun2(int s, List<LinkedList<Integer>> g, boolean[] vis) {
		
		Stack<Integer> stk = new Stack<Integer>();

		vis[s] = true;
		stk.push(s);

		while(!stk.empty()) {
			int top = stk.pop();
			System.out.print(top + " ");

			for(Integer edge : g.get(top)) {
				if(vis[edge] == false) {
					stk.push(edge);
					vis[edge] = true;
				}
			}
		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n, e; 
		n = scanner.nextInt();
		e = scanner.nextInt();

		boolean[] vis = new boolean[n];
		List<LinkedList<Integer>> g = new ArrayList<LinkedList<Integer>>();

		for(int i=0;i<n;i++) g.add(new LinkedList<Integer>());

		for(int i=0;i<e;i++) {
			int u = scanner.nextInt();
			int v = scanner.nextInt();

			g.get(u).add(v);
			g.get(v).add(u);
		}

		dfs_fun2(0, g, vis);
	}
}

/*


4 5
0 1 
0 2
0 3
1 2
2 2

*/