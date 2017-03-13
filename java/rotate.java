public class Solution {
    public void rotate(int[] nums, int k) {
        int count = 0;
        k = k % nums.length;
        for(int i = 0; i < k; i++){
            int j = (i + k)%nums.length;
            int first = j;
            do {
                swap(nums, i, j);
                count++;
                if(count == nums.length) return;
                j = (j + k)%nums.length;
            } while(j != first);
        }
    }

    public void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
