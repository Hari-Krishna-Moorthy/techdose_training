public class LowestCommonAncestor {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
    }
}
class TreeNode {
    Integer val;
    TreeNode left, right;
    TreeNode() {
    }
    TreeNode(int val) {
        this.val = val;
    }
}

/*
    1
    2 3 
    4 5 6 7
*/