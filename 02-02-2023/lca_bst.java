class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return null;
        if(root==p || root==q) return root;
        TreeNode lf = lowestCommonAncestor(root.left,p,q);
        TreeNode rt = lowestCommonAncestor(root.right,p,q);
        if(lf!=null && rt!=null) return root;
        if(lf!=null) return lf;
        if(rt!=null) return rt;
        return null;
    }
}
