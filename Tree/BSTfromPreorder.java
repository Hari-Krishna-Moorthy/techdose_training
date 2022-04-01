import java.util.ArrayList;
import java.util.List;

class BSTfromPreorder {
	
	static TreeNode buildBST(TreeNode root, int data) {
		if(root == null) 
			return new TreeNode(data);

		if(root.data > data)
			root.left = buildBST(root.left, data);
		else
			root.right = buildBST(root.right, data);
		return root;
	}

	static TreeNode bstfromPreorder(List<Integer> preorder) {
		TreeNode root = null;
		for(Integer num : preorder){
			root = buildBST(root, num);
		}
		return root;
	}
	public static void preOrder(TreeNode root) {
		if(root == null) return;
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(8);
		l.add(100);
		l.add(1);
		l.add(7);
		l.add(10);
		l.add(12);

		TreeNode bst = bstfromPreorder(l);
		preOrder(bst);

	}
}

class TreeNode {
	Integer data;
	TreeNode left, right;
	TreeNode() {}
	TreeNode(int data) {
		this.data=data;
	}
	public String toString() {
		return this.data.toString();
	}
}
