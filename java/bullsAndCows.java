public class Solution {
    public String getHint(String secret, String guess) {
        int[] true_table = new int[10];
        int cows = 0;
        int bulls = 0;
        int length = secret.length();
        if(length != guess.length()){
            throw new IllegalArgumentException();
        }

        for(char c: secret.toCharArray()){
            true_table[c-'0']++;
        }
        for(char c: guess.toCharArray()){
            if(true_table[c-'0'] > 0){
                cows++;
                true_table[c-'0']--;
            }
        }
        for(int i = 0; i < length; i++){
            if(secret.charAt(i) == guess.charAt(i)) bulls++;
        }
        cows -= bulls;
        return String.format("%dA%dB", bulls, cows);
    }
}
