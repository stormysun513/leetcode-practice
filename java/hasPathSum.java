public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return false;

        if(root.left == null && root.right == null){
            if(sum == root.val)
                return true;
            else
                return false;
        }
        boolean result = hasPathSum(root.left, sum-root.val);
        if(result) return true;
        return hasPathSum(root.right, sum-root.val);
    }
}
