// 0 ms	39 MB
class Solution {
    public int maxDepth(TreeNode root) {
        int depth = getMaximumDepth(root);
        return depth;
    }
    
    public int getMaximumDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int left = getMaximumDepth(root.left) + 1;
        int right = getMaximumDepth(root.right) + 1;
        
        return Math.max(left, right);
    }
}
