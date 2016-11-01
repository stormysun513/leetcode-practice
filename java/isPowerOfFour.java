public class Solution {
    public boolean isPowerOfFour(int num) {
        int mask = 1;
        while(mask != 0){
            if((mask^num) == 0){
                return true;
            }
            mask <<= 2;
        }
        return false;
    }
}
