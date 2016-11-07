class Solution {
    public int singleNumber(int[] nums) {
        int buf = 0;

        for(int num: nums){
            buf = (buf ^ num);
        }
        return buf;
    }
}
