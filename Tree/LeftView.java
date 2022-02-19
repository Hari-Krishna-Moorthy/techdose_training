import java.util.Queue;
import java.util.LinkedList;

class LeftView {

	public static void leftView(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);

		int len = 0;
		while(!queue.isEmpty()) {
			int currLen = queue.size();
			System.out.print(queue.peek() + " ");
			for(int i=0;i<currLen;i++) {
				TreeNode curr = queue.poll();
				if(curr.left != null) queue.add(curr.left);
				if(curr.right != null) queue.add(curr.right);
			}
		}
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.right.left = new TreeNode(4);
		root.right.left.right = new TreeNode(6);
		root.right.right = new TreeNode(5);

		leftView(root);
	}
}

class TreeNode {
	int data;
	TreeNode left, right;
	TreeNode(int data) {
		this.data = data;
	}
	public String toString() {
		return String.format("%d", this.data);
	}
}

/*
				1
			2		3 
				4		5
					6


*/