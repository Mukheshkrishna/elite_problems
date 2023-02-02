class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return Create(nums, 0, nums.length - 1);
    }

    private TreeNode Create(int nums[], int left, int right) {
        if (left > right) return null;
        int mid = (left + right) / 2; 
        TreeNode root = new TreeNode(nums[mid]); 
        root.left = Create(nums, left, mid - 1);
        root.right = Create(nums, mid + 1, right);
        return root;
    }
}
