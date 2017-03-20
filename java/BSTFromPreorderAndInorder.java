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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Queue<Integer> q = new LinkedList();
        for(int num: preorder){
            q.offer(num);
        }
        return helper(q, inorder, 0, inorder.length-1);
    }
    
    public TreeNode helper(Queue<Integer> q, int[] inorder, int start, int end){
        if(start > end){
            return null;
        }
        if(start == end){
            return new TreeNode(q.poll());
        }
        
        int split = q.poll();
        int idx = start;
        while(idx <= end && inorder[idx] != split) idx++;
        
        TreeNode root = new TreeNode(split);
        root.left = helper(q, inorder, start, idx-1);
        root.right = helper(q, inorder, idx+1, end);
        return root;
    }
}