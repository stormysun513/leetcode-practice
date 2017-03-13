/**
 *  * Definition for a binary tree node.
 *   * public class TreeNode {
 *    *     int val;
 *     *     TreeNode left;
 *      *     TreeNode right;
 *       *     TreeNode(int x) { val = x; }
 *        * }
 *         */
public class Solution {
    public int pathSum(TreeNode root, int sum) {
        if(root == null) return 0;
        return findSum(root, 0, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    public int findSum(TreeNode root, int prev, int sum) {
        if(root == null) return 0;

        int temp = prev + root.val;
        int add = (temp == sum) ? 1 : 0;
        return add + findSum(root.left, temp, sum) + findSum(root.right, temp, sum);
    }
}
