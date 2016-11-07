public class Solution {
    public boolean isHappy(int n) {
        int slow = n, fast = n;

        do {
            slow = squareSum(slow);
            fast = squareSum(squareSum(fast));
        } while(slow != fast);
        return (fast == 1);
    }

    public int squareSum(int num){
        int sum = 0, temp = num;

        while(temp != 0){
            int ones = temp % 10;
            sum += (ones*ones);
            temp /= 10;
        }
        return sum;
    }
}
