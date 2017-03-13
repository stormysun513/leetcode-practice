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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new LinkedList<String>();
        StringBuilder sb = new StringBuilder();
        treePathHelper(root, sb, ans);
        return ans;
    }

    public void treePathHelper(TreeNode root, StringBuilder path, List<String> ans){
        int length = path.length();
        if(root == null) return;

        path.append("->");
        path.append(Integer.toString(root.val));

        if(root.left == null && root.right == null){
            ans.add(path.substring(2));
            path.setLength(length);
            return;
        }

        treePathHelper(root.left, path, ans);
        treePathHelper(root.right, path, ans);
        path.setLength(length);
    }
}
