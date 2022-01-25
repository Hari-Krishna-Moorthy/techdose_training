import java.util.Scanner;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.PriorityQueue;


class bfs {
	

	public static void bfs_fun(int s, List<LinkedList<Integer>> g, boolean[] vis) {
		Queue<Integer> q = new PriorityQueue<Integer>();

		q.add(s);
		vis[s] = true;

		while(!q.isEmpty()) {

			int front = q.poll();
			System.out.print(front + " ");

			for(Integer edge : g.get(front)) {
				if(vis[edge] == false) {
					q.add(edge);
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

		bfs_fun(0, g, vis);
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