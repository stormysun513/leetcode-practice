public class Solution {
    public int addDigits(int num) {
        int next = num;
        int temp;

        while(next / 10 != 0){
            temp = 0;
            while(next != 0){
                temp += (next % 10);
                next /= 10;
            }
            next = temp;
        }
        return next;
    }
}
