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
    public int sumOfLeftLeaves(TreeNode root) {
        return sumOfLeftLeavesHelper(root, null);
    }

    public int sumOfLeftLeavesHelper(TreeNode node, TreeNode parent){
        if(node == null){
            return 0;
        }
        if(node.left == null && node.right == null){
            if(parent != null && parent.left == node){
                return node.val;
            }
        }
        return sumOfLeftLeavesHelper(node.left, node) + sumOfLeftLeavesHelper(node.right, node);
    }
}
