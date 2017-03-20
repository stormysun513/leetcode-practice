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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Queue<Integer> q = new LinkedList();
        
        for(int i = postorder.length-1; i >= 0; i--){
            q.offer(postorder[i]);
        }
        return helper(q, inorder, 0, inorder.length-1);
    }
    
    private TreeNode helper(Queue<Integer> q, int[] inorder, int start, int end){
        if(start > end) return null;
        
        if(start == end){
            return new TreeNode(q.poll());
        }
        
        int split = q.poll();
        int idx = end;
        while(idx >= start && inorder[idx] != split) idx--;
        
        TreeNode root = new TreeNode(split);
        root.right = helper(q, inorder, idx+1, end);
        root.left = helper(q, inorder, start, idx-1);
        return root;
    }
}