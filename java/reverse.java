public class Solution {
    public int reverse(int x) {
        boolean isNeg = (x < 0);
        long temp = 0;
        long ubound = (long)Integer.MAX_VALUE;

        if(x == Integer.MIN_VALUE) return 0;
        x = Math.abs(x);
        while(x > 0){
            temp = temp * 10 + (x % 10);
            if(temp > ubound) return 0; // overflow happens
            x /= 10;
        }
        return (isNeg) ? -1*(int)temp : (int)temp;
    }
}
