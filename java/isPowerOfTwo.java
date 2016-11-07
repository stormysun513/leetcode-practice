public class Solution {
    public boolean isPowerOfTwo(int n) {
        int mask = 1;
        if(n <= 0){
            return false;
        }

        while(mask != 0){
            if((mask^n) == 0){
                return true;
            }
            mask <<= 1;
        }
        return false;
    }
}
