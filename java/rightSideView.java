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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList();
        helper(root, 0, ans);
        return ans;
    }
    
    private void helper(TreeNode node, int depth, List<Integer> ans){
        if(node == null)
            return;
        
        int size = ans.size();
        if(depth == size){
            ans.add(node.val);
        }
        helper(node.right, depth+1, ans);
        helper(node.left, depth+1, ans);
    }
}