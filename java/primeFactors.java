import java.util.*;
import java.lang.*;

class Solution {
    public ArrayList<Long> primeFactors(long N){
        ArrayList<Long> ans = new ArrayList<Long>();
        if(N <= 1) return ans;

        long ubound = (long)Math.sqrt(N);
        if(N % 2 == 0){
            ArrayList<Long> tmp = primeFactors(N/2);
            ans.add((long)2);
            ans.addAll(tmp);
            return ans;
        }

        for(long i = 3; i <= ubound; i+=2){
            if(N % i == 0){
                ArrayList<Long> tmp = primeFactors(N/i);
                ans.add(i);
                ans.addAll(tmp);
                return ans;
            }
        }
        ans.add(N);
        return ans;
    }

    public static void main(String[] args){
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.primeFactors(10000001L).toArray()));
    }
}
