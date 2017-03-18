public class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> ans = new ArrayList();
        List<String> buf = new ArrayList();
        
        helper(s, 0, buf, ans);
        return ans;
    }
    
    private void helper(String s, int idx, List<String> buf, List<String> ans){
        int num = buf.size();
        int length = s.length();
        
        if(num == 4){
            if(idx == length){
                String joined = String.join(".", buf);
                ans.add(joined);
            }
            return;
        }
        
        for(int i = idx+1; i <= length; i++){
            String temp = s.substring(idx, i);
            int res = Integer.valueOf(temp);
            if(!temp.equals(Integer.toString(res))){
                return;
            }
            
            if(res <= 255 && res >= 0){
                buf.add(temp);
                helper(s, i, buf, ans);
                buf.remove(num);
            }
            else{
                break;
            }
        }
    }
}