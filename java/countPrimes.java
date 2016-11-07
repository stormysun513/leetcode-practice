public class Solution {
    public int countPrimes(int n) {
        if(n <= 1) return 0;

        boolean[] table = new boolean[n];
        int count = 0;

        for(int i = 2; i < n; i++){
            if(table[i] == false){
                for(int j = 2*i; j < n; j += i){
                    table[j] = true;
                }
            }
        }
        for(int i = 2; i < n; i++){
            if(table[i] == false){
                count++;
            }
        }
        return count;
    }
}
