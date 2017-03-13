public class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        if(strs == null || strs.length == 0) return sb.toString();

        sb.append(strs[0]);
        for(int i = 1; i < strs.length; i++){
            int j = sb.length();
            while(j > 0 && !strs[i].startsWith(sb.substring(0, j))) j--;
            sb.setLength(j);
        }
        return sb.toString();
    }
}
