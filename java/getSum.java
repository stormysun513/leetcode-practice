public class Solution {
    public int getSum(int a, int b) {
        if(b == 0){
            return a;
        }
        int temp1 = (a ^ b);
        int temp2 = (a & b) << 1;
        return getSum(temp1, temp2);
    }
}
