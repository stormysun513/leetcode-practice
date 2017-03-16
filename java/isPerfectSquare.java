public class Solution {
    public boolean isPerfectSquare(int num) {
        int last = num/2;
        
        if(num == 1 || num == 4 || num == 0)
            return true;
        
        int left = 1, right = num/2;
        
        while(true){
            int mid = left + (right-left)/2;
            if(mid == last){
                return false;
            }
            
            long res = (long)mid*mid;
            if(res == num){
                return true;
            }
            else if(res < num){
                left = mid;
            }
            else{
                right = mid;
            }
            last = mid;
            //System.out.println(last);
        }
    }
}