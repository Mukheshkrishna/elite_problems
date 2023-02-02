class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode newNode=new TreeNode(val);
        if(root==null) return newNode;
        if(root.val>val){
            root.left = insertIntoBST(root.left,val);
        } 
        else{
            root.right = insertIntoBST(root.right,val);
        }
        return root;
        
    }
}
