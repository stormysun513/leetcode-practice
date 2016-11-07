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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        insertLevelTraverseRecursive(root, 0, ans);
        Collections.reverse(ans);
        return ans;
    }

    public void insertLevelTraverseRecursive(TreeNode node, int d, List<List<Integer>> ans){
        if(node == null) return;

        if(d == ans.size()){
            ans.add(new LinkedList<Integer>());
        }
        ans.get(d).add(node.val);
        insertLevelTraverseRecursive(node.left, d+1, ans);
        insertLevelTraverseRecursive(node.right, d+1, ans);
    }
}
