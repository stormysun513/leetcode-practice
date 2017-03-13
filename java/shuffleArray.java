public class Solution {

    public Solution(int[] nums) {
        data = new int[nums.length];
        System.arraycopy(nums, 0, data, 0, nums.length);
        random = new Random();
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        int[] res = new int[data.length];
        System.arraycopy(data, 0, res, 0, data.length);
        return res;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int[] res = new int[data.length];
        System.arraycopy(data, 0, res, 0, data.length);
        for(int i = 0; i < res.length; i++){
            int j = random.nextInt(res.length-i);
            int temp = res[i];
            res[i] = res[i+j];
            res[i+j] = temp;
        }
        return res;
    }

    Random random;
    int[] data;
}
