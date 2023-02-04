class Solution {
    ArrayList<Integer> arr = new ArrayList<>();
    int i=0;
    public void recoverTree(TreeNode root) {
        inorder(root);
        Collections.sort(arr);
        correct(root);
    }
    public void inorder(TreeNode root){
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        arr.add(root.val);
        inorder(root.right);
    }
    public void correct(TreeNode root)
    {
        if(root==null) return;
        if(root!=null)
        {
            correct(root.left);
            if(root.val!=arr.get(i))
            {
                root.val=arr.get(i);
            }
            i++;
            correct(root.right);
        }
    }
}
