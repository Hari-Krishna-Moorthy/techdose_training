public class RightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<Integer> l = new LinkedList<Integer>();
        queue.add(root);
        if (root == null)
            return l;
        while (!queue.isEmpty()) {
            int len = queue.size();
            l.add(queue.peek().val);
            for (int i = 0; i < len; i++) {
                TreeNode top = queue.poll();
                if (top.right != null)
                    queue.add(top.right);
                if (top.left != null)
                    queue.add(top.left);
            }
        }
        return l;
    }
    
}
