class DiameterofBinaryTree {

	public static int findDiameter(TreeNode root) {
		if(root == null) return 0;

		int lefth = findHeight(root.left);
		int righth = findHeight(root.right);

		int maxDia = Math.max(
			findDiameter(root.left), 
			findDiameter(root.right)
		);


		return Math.max(lefth+righth+1, maxDia);
	} 

	public static int findHeight(TreeNode root) {
		if(root == null) return 0;
		return Math.max(
			findHeight(root.left),
			findHeight(root.right)
		) + 1;
	}

	public static void main(String[] args) {
		TreeNode root1 = new TreeNode(1);
		root1.left = new TreeNode(2);
		root1.right = new TreeNode(3);
		root1.left.left = new TreeNode(4);
		root1.left.right = new TreeNode(5);

		TreeNode root2 = new TreeNode(1);
		root2.left = new TreeNode(2);
		root2.right = new TreeNode(3);
		root2.left.left = new TreeNode(4);
		root2.left.right = new TreeNode(5);
		TreeNode temp = root2.left.right;
		
		temp.left = new TreeNode(6);
		temp.right = new TreeNode(7);

		temp.left.left = new TreeNode(11);
		temp.right.right = new TreeNode(8);
		temp.left.left.left = new TreeNode(12);
		temp.right.right.right = new TreeNode(9);

		temp.left.left.left.left = new TreeNode(13);
		temp.right.right.right.right = new TreeNode(10);
		temp.left.left.left.left.left = new TreeNode(14);


		// System.out.println("Diameter : " + findDiameter(root1));
		System.out.println("Diameter : " + findDiameter(root2) );
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

	Tree 1 => [4, 2, 1, 3] Diameter = 3

				1
		2				3
	4		5

	Tree 2 	=> [14, 13, 12, 11, 6, 5, 7, 8, 9, 10] Diameter = 10
				1
		2 				3
	4		5
          6   7
         11    8
        12      9
       13        10
      14   			


*/