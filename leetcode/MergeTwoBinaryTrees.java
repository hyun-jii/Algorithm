// 0 ms	39.1 MB
class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        return getTree(t1, t2);
    }
    
    public TreeNode getTree(TreeNode t1, TreeNode t2) {
        if(t1 == null) {
            return t2;
        }
        else if(t2 == null) {
            return t1;
        }
        t1.val = t1.val + t2.val;
        t1.left = getTree(t1.left, t2.left);
        t1.right = getTree(t1.right, t2.right);
        
        return t1;
    }
}
