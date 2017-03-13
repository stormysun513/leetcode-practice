public class Solution {
    public int divide(int dividend, int divisor) {
        int neg = 0;

        if(divisor == 0) return Integer.MAX_VALUE;
        if((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)) neg = 1;

        long new_dividend = (dividend >= 0) ? dividend : -1L*dividend;
        long new_divisor = (divisor >= 0) ? divisor : -1L*divisor;

        long ans = divideHelper(new_dividend, new_divisor);
        if(neg == 0 && ans > (long)Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        if(neg == 1 && ans > (long)Integer.MAX_VALUE + 1){
            return Integer.MAX_VALUE;
        }
        return (neg == 0) ? (int)ans: (int)(-1*ans);
    }

    public long divideHelper(long dividend, long divisor){
        long temp1 = dividend;
        long quotient = 0;

        while(temp1 >= divisor){
            long q = 1;
            long temp2 = divisor;

            while(temp1 >= (temp2 << 1)){
                temp2 <<= 1;
                q <<= 1;
            }
            quotient += q;
            temp1 -= temp2;
        }
        return quotient;
    }
}
