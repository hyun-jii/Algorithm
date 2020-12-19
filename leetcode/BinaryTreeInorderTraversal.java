// 0 ms	37.4 MB	java
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) {
            return list;
        }
        inorder(root, list);
        
        return list;
    }
    
    public void inorder(TreeNode root, List<Integer> list) { 
        if(root != null) {
            if(root.left != null) {
                inorder(root.left, list);
            }
            list.add(root.val);

            if(root.right != null) {
                inorder(root.right, list);
            }
        }          
    }
    
}
