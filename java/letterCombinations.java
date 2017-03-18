public class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Character, String> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        List<String> ans = new ArrayList<>();
        
        if(digits.equals(""))
            return ans;
        
        map.put('1',"");
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        map.put('0',"");
        
        helper(digits, map, sb, ans);
        return ans;
    }
    
    public void helper(String digits, HashMap<Character, String> map, StringBuilder sb, List<String> ans){
        int idx = sb.length();
        
        if(idx == digits.length()){
            ans.add(sb.toString());
            return;
        }
        String repo = map.get(digits.charAt(idx));
        for(char c: repo.toCharArray()){
            sb.append(c);
            helper(digits, map, sb, ans);
            sb.deleteCharAt(idx);
        }
    }
}