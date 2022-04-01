public class MaximumPathSum {
    int result = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if(root == null) return 0;
        maxPathSum(root, Integer.MIN_VALUE);
        return result;
    }
    
    public int maxPathSum(TreeNode root, int temp) {
        if(root == null) return 0;
        int left = maxPathSum(root.left, temp);
        int right = maxPathSum(root.right, temp);
        
        int max_1 = Math.max(Math.max(left, right)+root.val, root.val);
        int max_2 = Math.max(root.val, left+right+root.val);
        this.result = Math.max(max_2, this.result);
        return max_1;
    }
}
