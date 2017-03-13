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
    class Result {
        boolean isp;
        boolean isq;
        TreeNode ances;
        Result(boolean p, boolean q, TreeNode a) {
            isp = p;
            isq = q;
            ances = a;
        }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || p == null || q == null) return null;
        if(p == q) return p;

        Result res = LCAHelper(root, p, q);
        return res.ances;
    }

    public Result LCAHelper(TreeNode node, TreeNode p, TreeNode q){
        if(node == null) return new Result(false, false, null);

        boolean isp = (node == p);
        boolean isq = (node == q);

        Result lres = LCAHelper(node.left, p, q);
        if(lres.ances != null) return lres;

        Result rres = LCAHelper(node.right, p, q);
        if(rres.ances != null) return rres;

        isp = isp | lres.isp | rres.isp;
        isq = isq | lres.isq | rres.isq;

        if(isp && isq){
            return new Result(isp, isq, node);
        }
        else{
            return new Result(isp, isq, null);
        }

    }
}
