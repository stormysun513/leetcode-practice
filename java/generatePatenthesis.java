public class Solution {
    public List<String> generateParenthesis(int n) {
        StringBuilder sb = new StringBuilder();
        List<String> ans = new ArrayList<>();
        helper(sb, 0, n, ans);
        return ans;
    }
    
    public void helper(StringBuilder sb, int num, int n, List<String> ans){
        int length = sb.length();
        
        if(length == 2*n){
            ans.add(sb.toString());
            return;
        }
        
        if(num < n){
            sb.append("(");
            helper(sb, num+1, n, ans);
            sb.deleteCharAt(length);
        }
        
        if(2*(n - num) < (2*n-length)){
            sb.append(")");
            helper(sb, num, n, ans);
            sb.deleteCharAt(length);
        }
    }
}