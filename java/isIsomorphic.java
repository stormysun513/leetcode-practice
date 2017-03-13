public class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] forward = new int[256];
        int[] backward = new int[256];
        int length = s.length();

        if(t.length() != length) return false;

        for(int i = 0; i < length; i++){
            char ch_s = s.charAt(i);
            char ch_t = t.charAt(i);
            if(forward[ch_s] == 0 && backward[ch_t] == 0){
                forward[ch_s] = ch_t;
                backward[ch_t] = ch_s;
            }
            else if(forward[ch_s] != 0 && backward[ch_t] != 0){
                if(forward[ch_s] != ch_t){
                    return false;
                }
            }
            else{
                return false;
            }
        }
        return true;
    }
}
