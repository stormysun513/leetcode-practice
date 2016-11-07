public int removeElement(int[] nums, int val) {
    int count = 0;
    int index = 0;
    int new_index = 0;
    while(index < nums.length){
        while(index < nums.length && nums[index] == val) index++;
        if(index < nums.length){
            nums[new_index++] = nums[index++];
            count++;
        }
    }
    return count;
}
