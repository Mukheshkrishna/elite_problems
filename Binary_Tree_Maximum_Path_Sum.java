/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int maxsum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxPath(root);
        return maxsum;
    }
    public int maxPath(TreeNode root){
        if(root==null) return 0;
        int maxleft = Math.max(0,maxPath(root.left));
        int maxright = Math.max(0,maxPath(root.right));
        maxsum = Math.max(maxsum,root.val+maxleft+maxright);
        return root.val + Math.max(maxleft,maxright);
    }
}
