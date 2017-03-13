public class Solution {
    public int totalHammingDistance(int[] nums) {
        int[] table = new int[32];
        int count = 0;
        int size = nums.length;

        for(int num: nums){
            int i = 0;
            while(num != 0){
                table[i] += (num & 1);
                num >>>= 1;
                i++;
            }
        }

        for(int i = 0; i < 32; i++){
            count += (size-table[i])*table[i];
        }
        return count;
    }
}
