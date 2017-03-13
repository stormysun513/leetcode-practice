public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;

        while(temp != null){
            ans.add(temp.val);
            stack.push(temp);
            temp = temp.left;
        }

        while(!stack.empty()){
            TreeNode top = stack.pop();
            temp = top.right;
            while(temp != null){
                ans.add(temp.val);
                stack.push(temp);
                temp = temp.left;
            }
        }
        return ans;
    }
}
