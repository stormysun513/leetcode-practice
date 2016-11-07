public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap();
    int[] ans = new int[2];

    for(int i = 0; i < nums.length; i++){
        int temp = target - nums[i];
        if(map.containsKey(temp)){
            ans[0] = map.get(temp);
            ans[1] = i;
            return ans;
        }
        map.put(nums[i], i);
    }
    return ans;
}
