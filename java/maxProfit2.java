public class Solution {
    public int maxProfit(int[] prices) {
        int sum = 0;
        int prev = Integer.MAX_VALUE;

        for(int i = 0; i < prices.length; i++){
            int curr = prices[i];
            if(curr > prev){
                sum += (curr-prev);
            }
            prev = curr;
        }
        return sum;
    }
}
