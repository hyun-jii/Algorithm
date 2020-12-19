// 0 ms	37.3 MB	java
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) {
            return list;
        }
        postOrder(root, list);
        
        return list;
    }
    public void postOrder(TreeNode root, List<Integer> list) {
        if(root != null) {
            if(root.left != null) {
                postOrder(root.left, list);
            }
            if(root.right != null) {
                postOrder(root.right, list);
            }
            list.add(root.val);
        }
    }
}
