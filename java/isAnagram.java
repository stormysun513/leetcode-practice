public class Solution {
    public boolean isAnagram(String s, String t) {
        int[] tbl = new int[256];
        for(char c: s.toCharArray()){
            tbl[c]++;
        }
        for(char c: t.toCharArray()){
            tbl[c]--;
        }
        for(int i = 0; i < 256; i++){
            if(tbl[i] != 0){
                return false;
            } 
        }
        return true;
    }
}
