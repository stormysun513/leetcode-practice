public class Solution {
    public boolean isPowerOfThree(int n) {
        if(n <= 0){
            return false;
        }
        if(n == 1){
            return true;
        }

        int temp = n%3;
        if(temp == 0){
            return isPowerOfThree(n/3);
        }
        else{
            return false;
        }
    }

    public boolean isPowerOfThree2(int n) {
        // 1162261467 is 3^19,  3^20 is bigger than int  
        return ( n>0 &&  1162261467%n==0);
    }
}
