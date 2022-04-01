// URL : https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal


import java.util.Queue;
import java.util.LinkedList;


class ConstructBinaryTree {

	public static void levelOrder2(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);

		while(! queue.isEmpty()) {

			TreeNode front = queue.poll();
			System.out.print(front.val + " ");
			if(front.left != null) queue.add(front.left);
			if(front.right != null) queue.add(front.right);
		}

	}

	public static TreeNode buildTree(int[] preorder, int ps, int pe, int[] inorder, int is, int ie) {
		if(ps > pe) return null;
		int i=0;
		while(inorder[is+i] != preorder[ps])
			i++;

		TreeNode root = new TreeNode(preorder[ps]);
        root.left = buildTree(preorder, ps+1, ps+i, inorder, is, is+i-1);
        root.right = buildTree(preorder, ps+i+1, pe, inorder, is+i+1, ie);
        return root;

	}


	public static TreeNode buildTree(int[] preorder, int[] inorder) {
    	return buildTree(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1);
    }

	public static void main(String[] args) {
		
		levelOrder2(buildTree(
			new int[] {3, 9, 20, 15, 7},
			new int[] {9, 3, 15, 20, 7}
			));
	}
}


class TreeNode {
	int val;
    TreeNode left, right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
