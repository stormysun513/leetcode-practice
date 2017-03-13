public class Solution {
    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        long current = Long.MIN_VALUE;

        while(temp != null){
            stack.push(temp);
            temp = temp.left;
        }

        while(!stack.empty()){
            TreeNode top = stack.pop();
            if((long)top.val <= current){
                return false;
            }
            current = (long)top.val;
            temp = top.right;
            while(temp != null){
                stack.push(temp);
                temp = temp.left;
            }
        }
        return true;
    }
}
