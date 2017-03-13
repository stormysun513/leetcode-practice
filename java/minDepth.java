public class Solution {
    public int minDepth(TreeNode root) {
        int temp = Integer.MAX_VALUE;
        if(root == null) return 0;

        if(root.left != null){
            temp = Math.min(temp, 1 + minDepth(root.left));
        }
        if(root.right != null){
            temp = Math.min(temp, 1 + minDepth(root.right));
        }
        if(temp < Integer.MAX_VALUE){
            return temp;
        }
        return 1;
    }
}
