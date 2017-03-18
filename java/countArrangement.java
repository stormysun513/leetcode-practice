public class Solution {
    public int countArrangement(int N) {
        boolean[] table = new boolean[N+1];
        return helper(table, 1);
    }
    
    public int helper(boolean[] table, int idx){
        if(idx == table.length){
            return 1;
        }
        
        int count = 0;
        for(int i = 1; i < table.length; i++){
            if(!table[i]){
                if(i % idx == 0 || idx % i == 0){
                    table[i] = true;
                    count += helper(table, idx+1);
                    table[i] = false;
                }
            }
        }
        return count;
    }
}