class Solution {
    List<Integer> arr = new ArrayList<>();
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        InOrder(root1);
        InOrder(root2);
        Collections.sort(arr);
        return arr; 
    }
    
    public void InOrder(TreeNode root){
        if(root == null) return;
        InOrder(root.left);
        arr.add(root.val);
        InOrder(root.right);
    }
}
