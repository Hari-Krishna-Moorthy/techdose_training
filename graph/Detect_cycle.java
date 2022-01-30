import java.util.Vector;




class Detect_cycle {

	public static void add_edge(Vector<Vector<Integer>> g, int src, int dest) {
		g.get(src).add(dest);
	}

	public static boolean is_cyclic_utill(Vector<Vector<Integer>> g, boolean[] vis, int curr) {
		if(vis[curr]) return true;

		vis[curr] = true;
		boolean FLAG = false;
		for(int i=0;i<g.get(curr).size(); ++i) {
			FLAG = is_cyclic_utill(g, vis, g.get(curr).get(i));
			if(FLAG) return true;
		}
		return false;
	} 

	public static boolean is_cyclic(int noof_vertex, Vector<Vector<Integer>> g) {
		boolean[] vis = new boolean[noof_vertex];
		boolean FLAG = false;

		for(int i=0;i<noof_vertex;i++) {
			vis[i] = true;

			for(int j=0;j<g.get(i).size();++j) {
				FLAG = is_cyclic_utill(g, vis, g.get(i).get(j)); 
				if(FLAG) 
					return true;
			}
			vis[i] = false;
		}
		return false;
	}

	public static void main(String[] args) {
		int noof_vertex = 5;

		Vector<Vector<Integer>> g = new Vector<>();

		for(int i=0;i<noof_vertex;i++) {
			g.add(new Vector<Integer>());
		}

		add_edge(g, 0, 1);
		add_edge(g, 4, 0);
		add_edge(g, 4, 2);
		add_edge(g, 2, 1);
		add_edge(g, 2, 3);
		add_edge(g, 3, 4);

		System.out.println(g);

		System.out.println(is_cyclic(noof_vertex, g));

	}
}