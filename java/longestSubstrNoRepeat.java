public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] table = new int[256];
        int start = 0;
        int end = 0;
        int result = 0;
        int length = s.length();

        if(length == 0) return 0;
        while(true){
            while(end < length && table[s.charAt(end)] < 1){
                table[s.charAt(end)]++;
                end++;
            }
            result = Math.max(result, end-start);
            if(end == length) return result;

            while(table[s.charAt(end)] > 0){
                table[s.charAt(start)]--;
                start++;
            }
        }
    }
}
