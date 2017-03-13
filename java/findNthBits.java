public class Solution {
    public int findNthDigit(int n) {
        int base = 9;
        int digits = 1;
        int sum = 0;

        while(base <= Integer.MAX_VALUE/digits && n > (sum + base*digits)){
            sum += base*digits;
            base *= 10;
            digits++;
        }

        int quotient = (n - sum)/digits;
        int remain = (n - sum)%digits;

        if(remain == 0){
            return (base/9 + (quotient - 1))%10;
        }
        else{
            int temp = (base/9 + quotient);
            int reverse = digits - remain;
            while(reverse > 0){
                temp /= 10;
                reverse--;
            }
            return (temp % 10);
        }
    }
}
