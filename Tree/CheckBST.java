class CheckBST {
	public static void main(String[] args) {
		TreeNode root1 = new TreeNode(8);
		root1.left = new TreeNode(5);
		root1.right = new TreeNode(12);
		root1.left.left = new TreeNode(4);
		root1.left.right = new TreeNode(9);
		root1.right.left = new TreeNode(11);
		root1.right.right = new TreeNode(13);


		TreeNode root2 = new TreeNode(8);
		root2.left = new TreeNode(5);
		root2.right = new TreeNode(12);
		root2.left.left = new TreeNode(4);
		root2.left.right = new TreeNode(6);
		root2.right.left = new TreeNode(13);
		root2.right.right = new TreeNode(16);


		TreeNode root3 = new TreeNode(8);
		root3.left = new TreeNode(5);
		root3.right = new TreeNode(12);
		root3.left.left = new TreeNode(4);
		root3.left.right = new TreeNode(6);
		root3.right.left = new TreeNode(7);
		root3.right.right = new TreeNode(16);
		
		System.out.println("Tree 1 : " + isBST(root1));
		System.out.println("Tree 2 : " + isBST(root2));
		System.out.println("Tree 3 : " + isBST(root3));
	}
	public static boolean isBST(TreeNode root) {
		if(root == null) 
			return true;
		if(root.left != null && root.left.data > root.data) 
			return false;
		if(root.right != null && root.right.data < root.data) 
			return false;

		return isBST(root.left) &&  isBST(root.right);
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

/*

Condition : 

	i)	All nodes on right subtree are greater than root
	ii)	All nodes on left subtree are lewer than root



Tree 1

			  8	
		5			12
	4		9	11		16


Tree 2

			  8	
		5			12
	4		6	13		16



Tree 3

			  8	
		5			12
	4		6	7		16

*/