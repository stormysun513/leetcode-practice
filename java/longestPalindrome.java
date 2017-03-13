public class Solution {
    public int longestPalindrome(String s) {
        int[] table = new int[256];
        int odd = 0;
        int count = 0;

        for(char c: s.toCharArray()){
            table[c]++;
        }

        for(int i = 0; i < 256; i++){
            if((table[i]%2) == 0){
                count += table[i];
            } 
            else{
                count += 2*((table[i])/2);
                odd = 1;
            }
        }
        return (count+odd);
    }
}
