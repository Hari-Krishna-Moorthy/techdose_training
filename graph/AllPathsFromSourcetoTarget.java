import java.util.List;
import java.util.LinkedList;

class AllPathsFromSourcetoTarget {
    static private void util(int src, List<Integer> curr,
            int[][] graph, List<List<Integer>> res) {
        curr.add(src);
        if (src == graph.length - 1)
            res.add(curr);
        for (int neigh : graph[src]) {
            List<Integer> t = new LinkedList<Integer>(curr);
            util(neigh, t, graph, res);
        }
    }

    static public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        List<Integer> temp = new LinkedList<Integer>();
        util(0, temp, graph, res);
        return res;
    }

    public static void main(String[] args) {
        System.out.println(allPathsSourceTarget(new int[][] {{1,2},{3},{3},{}}));
        System.out.println(allPathsSourceTarget(new int[][] {{4,3,1},{3,2,4},{3},{4},{}}));
}}