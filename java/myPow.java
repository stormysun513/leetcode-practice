public class Solution {
    public double myPow(double x, int n) {
        if(n < 0){
            n = -n;
            x = 1.0/x;
        }
        
        double temp = x;
        double ans = 1.0;
        
        while(n != 0){
            ans = ((n & 0x1) == 1) ? ans*temp : ans;
            n >>>= 1;
            temp = temp * temp;
        }
        return ans;
    }
}