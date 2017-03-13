public class Solution {
    public int[] singleNumber(int[] nums) {
        int temp = 0;
        int[] ans = new int[2];

        for(int num: nums) temp ^= num;
        temp |= temp >>> 16;
        temp |= temp >>> 8;
        temp |= temp >>> 4;
        temp |= temp >>> 2;
        temp |= temp >>> 1;
        temp &= ~(temp >>> 1);

        for(int num: nums){
            if((num & temp) == 0){
                ans[0] ^= num;
            }
            else{
                ans[1] ^= num;
            }
        }
        return ans;
    }
}
