/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isBalanced(TreeNode root) {
        if(checkBTBalanced(root) == -1){
            return false;
        }
        return true;
    }

    public int checkBTBalanced(TreeNode node){
        if(node == null){
            return 0;
        }
        int left = checkBTBalanced(node.left);
        int right = checkBTBalanced(node.right);
        if(left == -1 || right == -1 || Math.abs(left-right) > 1){
            return -1;
        }
        return 1 + Math.max(left, right);
    }
}
