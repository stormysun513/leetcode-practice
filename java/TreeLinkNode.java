/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        HashMap<TreeLinkNode, Integer> map = new HashMap();
        Queue<TreeLinkNode> q = new LinkedList();
        TreeLinkNode lastNode = null;
        
        if(root == null) return;
        
        map.put(root, 0);
        q.offer(root);
        
        while(!q.isEmpty()){
            TreeLinkNode front = q.poll();
            int depth = map.get(front);
            if(lastNode != null){
                int lastDepth = map.get(lastNode);
                if(lastDepth != depth){
                    lastNode.next = null;
                }
                else{
                    lastNode.next = front;
                }
            }
            if(front.left != null){
                q.add(front.left);
                map.put(front.left, depth+1);
            }
            if(front.right != null){
                q.add(front.right);
                map.put(front.right, depth+1);
            }
            lastNode = front;
        }
        lastNode.next = null;
    }
}