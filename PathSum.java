class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        // Check if it's a leaf node
        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }

        // Recursively check left and right subtrees
        return hasPathSum(root.left, targetSum - root.val) ||
               hasPathSum(root.right, targetSum - root.val);
    }
}