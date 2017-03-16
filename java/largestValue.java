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
    public List<Integer> largestValues(TreeNode root) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        
        largestValuesHelper(root, 0, map);
        
        for(Map.Entry<Integer, Integer> e: map.entrySet()){
            ans.add(e.getValue());
        }
        return ans;
    }
    
    public void largestValuesHelper(TreeNode node, int depth, TreeMap<Integer, Integer> map){
        if(node == null)
            return;
        
        int value = map.getOrDefault(depth, Integer.MIN_VALUE);
        if(node.val >= value){
            map.put(depth, node.val);
        }
        largestValuesHelper(node.left, depth+1, map);
        largestValuesHelper(node.right, depth+1, map);
    }
}