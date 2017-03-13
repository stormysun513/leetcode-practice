public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] table = new int[256];
        for(char c: magazine.toCharArray()){
            table[c]++;
        }
        for(char c: ransomNote.toCharArray()){
            table[c]--;
        }
        for(int num: table){
            if(num < 0){
                return false;
            }
        }
        return true;
    }
}
