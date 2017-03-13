class Solution {
    public int maxProfit(int[] prices) {
        int length = prices.length;
        int[] fs = new int[length];
        int[] sb = new int[length];
        int[] ss = new int[length];

        if(length <= 0) return 0;

        int low = prices[0];
        for(int i = 1; i < length; i++){
            int val = prices[i];
            if(val > low){
                fs[i] = Math.max(fs[i-1], val-low);
            }
            else{
                low = val;
                fs[i] = fs[i-1];
            }

            if(i == 2){
                sb[i] = fs[i-1]-val;
            }
            else if(i > 2){
                sb[i] = Math.max(sb[i-1], fs[i-1]-val);
            }

            if(i == 3){
                ss[i] = sb[i-1]+val;
            }
            else if(i > 3){
                ss[i] = Math.max(ss[i-1], sb[i-1]+val);
            }
        }

        return Math.max(ss[length-1], fs[length-1]);
    }
}
