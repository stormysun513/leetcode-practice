public class Solution {
    public int mySqrt(int x) {
        int last = x/2;
        
        if(x == 1) return 1;
        if(x == 4) return 2;
        if(x == 0) return 0;
        
        int left = 1, right = x/2 + 1;
        while(true){
            int mid = left + (right-left)/2;
            if(mid == last){
                return last;
            }
            
            long res = (long)mid*mid;
            if(res == x){
                return mid;
            }
            else if(res < x){
                left = mid;
            }
            else{
                right = mid;
            }
            last = mid;
        }
    }
}