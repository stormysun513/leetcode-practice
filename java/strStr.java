public class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack == null || needle == null) return -1;
        int lengthH = haystack.length();
        int lengthN = needle.length();
        if(lengthN == 0) return 0;
        if(lengthH < lengthN) return -1;

        for(int i = 0; i < lengthH-lengthN+1; i++){
            if(haystack.substring(i, i+lengthN).equals(needle)) return i;
        }
        return -1;
    }
}
// Optional KMP algorithm
