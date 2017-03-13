public class NumArray {

    public NumArray(int[] nums) {
        table = new int[nums.length+1];
        for(int i = 1; i <= nums.length; i++){
            table[i] = table[i-1] + nums[i-1];
        }
    }

    public int sumRange(int i, int j) {
        if(i > j) return 0;
        return table[j+1]-table[i];
    }

    int[] table;
}
