public class Solution {
    public int lengthOfLastWord(String s) {
        if(s == null) return 0;

        s = s.trim();
        int length = s.length();
        for(int i = length-2; i >= 0; i--){
            char ch = s.charAt(i);
            if(Character.isWhitespace(ch)) return (length-1-i);
        }
        return length;
    }
}
