import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

class Tree {
	
	public static void preOrder1(TreeNode root) {
		if(root == null) return;
		System.out.print(root.data + " ");
		preOrder1(root.left);
		preOrder1(root.right);
	}

	public static void preOrder2(TreeNode root) {
		Stack<TreeNode> s = new Stack<TreeNode>();
		s.push(root);

		while(!s.isEmpty()) {
			TreeNode top = s.pop();
			if(top.right != null) s.push(top.right);
			if(top.left != null) s.push(top.left);
			System.out.print(top.data + " ");
		}
	}

	public static void inOrder1(TreeNode root) {
		if(root == null) return;
		inOrder1(root.left);
		System.out.print(root.data + " ");
		inOrder1(root.right);
	}

	public static void inOrder2(TreeNode root) {
		Stack<TreeNode> s = new Stack<TreeNode>();
		TreeNode curr = root;

		while(!s.isEmpty() || curr!=null) {
			while(curr != null) {
				s.push(curr);
				curr = curr.left;
			}
			curr = s.pop();
			System.out.print(curr.data + " ");
			curr = curr.right;
		}
	}
	public static void postOrder1(TreeNode root) {
		if(root == null) return;
		postOrder1(root.left);
		postOrder1(root.right);
		System.out.print(root.data + " ");
	}

	public static void postOrder2(TreeNode root) {
		Stack<TreeNode> stk1 = new Stack<TreeNode>();
		Stack<Integer> stk2 = new Stack<Integer>();
		stk1.push(root);

		while(!stk1.isEmpty()) {
			TreeNode top = stk1.pop();
			stk2.add(top.data);
			if(top.left != null) stk1.push(top.left);
			if(top.right != null) stk1.push(top.right);
		}
		while(! stk2.isEmpty())
			System.out.print(stk2.pop() + " ");
	}
	public static void levelOrder2(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);

		while(! queue.isEmpty()) {
			TreeNode front = queue.poll();
			System.out.print(front.data + " ");

			if(front.left != null) queue.add(front.left);
			if(front.right != null) queue.add(front.right);
		}

	}



	public static void main(String[] args) {
		TreeNode t = new TreeNode(10);
		t.left = new TreeNode(8);
		t.right = new TreeNode(2);
		t.left.left = new TreeNode(3);
		t.left.right = new TreeNode(5);
		t.right.left = new TreeNode(6);
		// preOrder1(t); System.out.println();
		// preOrder2(t); System.out.println();
		inOrder1(t); System.out.println();
		// inOrder2(t); System.out.println();
		// postOrder1(t); System.out.println();
		// postOrder2(t); System.out.println();

		// levelOrder1(t); System.out.println();
		levelOrder2(t); System.out.println();

	}
}

class TreeNode {
	Integer data;
	TreeNode left, right;
	TreeNode() {}
	TreeNode(int data) {
		this.data=data;
	}
}

/*

			10
	8				2
3		5		6

Steps :-
1) Pre Order [10 8 3 5 2 6]

	1) Push the root in stack
	2) while (stack is not empty)
		i)	pop & store top node from stack
		ii) print it
		iii)Push right (if avilable)
		iii)Push left (if avilable)

2) In Order [3 8 5 10 6 2 ]
	
	1) init curr = root
	2) while (stack is not empty && curr != null)
		i) while curr != null 
			*) Push curr to stack
			*) assign curr->left to curr
		ii) assign curr = s.peek, and pop the stack
		iii) print curr
		iv) assign curr = curr.right


3) Post Order [3 5 8 6 2 10]
	
	1) push root to stack1
	2) while s1 is not empty
		i)	pop top of s1 & push to s2 
		ii) push (node's left, right) to s1
	3) Print Stack 2


4) Level Order [10 	8 2   3 5 6 ]
		
	1) Add root to stack
	2) while stack is not empty
		i) print top and pop it
		ii) add left, right is available 
*/