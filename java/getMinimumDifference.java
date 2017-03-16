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
    public int getMinimumDifference(TreeNode root) {
        Stack<TreeNode> stack = new Stack();
        TreeNode temp = root;
        int diff = Integer.MAX_VALUE;
        int last = -1;
        
        if(root == null)
            return diff;
    
        while(temp != null){
            stack.push(temp);
            temp = temp.left;
        }
        
        while(!stack.empty()){
            TreeNode top = stack.pop();
            
            if(last != -1)
                diff = Math.min(diff, Math.abs(last-top.val));
            last = top.val;
            
            temp = top.right;
            while(temp != null){
                stack.push(temp);
                temp = temp.left;
            }
        }
        return diff;
    }
}