class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null){
            return root;
        } 
        if(root.val == key){
            TreeNode temp_left = root.left ;
            TreeNode temp_right = root.right;
            if(temp_right == null){
                return temp_left;
            }else{
                LeftLeaf(temp_right).left = temp_left;
                return temp_right;
            }
        }
        if(root.val >key){
            root.left = deleteNode(root.left,key);
        }else{
            root.right = deleteNode(root.right,key);
        }
        return root;
    }
    public TreeNode LeftLeaf(TreeNode root){
        if(root.left == null){
            return root ;
       }
        return LeftLeaf(root.left); 
    }
}
