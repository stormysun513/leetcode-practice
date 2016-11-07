public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> ans = new LinkedList<List<Integer>>();

    Arrays.sort(nums);
    for(int i = 0; i < nums.length; i++){
        int target = -nums[i];
        Set set = new HashSet();

        for(int j = i+1; j < nums.length; j++){
            int temp = target - nums[j];
            if(set.contains(temp)){
                List<Integer> triplet = new LinkedList<Integer>();
                triplet.add(nums[i]);
                triplet.add(temp);
                triplet.add(nums[j]);
                ans.add(triplet);
                while(j < (nums.length-1) && nums[j] == nums[j+1]) j++;
            }
            set.add(nums[j]);
        }
        while(i < (nums.length-1) && nums[i] == nums[i+1]) i++;
    }
    return ans;
}

public List<List<Integer>> threeSum2(int[] nums) {
    List<List<Integer>> ans = new LinkedList<List<Integer>>();

    Arrays.sort(nums);
    for(int i = 0; i < nums.length; i++){
        int j = i+1;
        int k = nums.length-1;
        while(j < k){
            if(nums[i]+nums[j]+nums[k] > 0) k--;
            else if(nums[i]+nums[j]+nums[k] < 0) j++;
            else{
                List<Integer> triplet = new LinkedList<Integer>();
                triplet.add(nums[i]);
                triplet.add(nums[j]);
                triplet.add(nums[k]);
                ans.add(triplet);
                while(k > 0 && nums[k-1] == nums[k]) k--;
                while(j < (nums.length-1) && nums[j] == nums[j+1]) j++;
                k--;
                j++;
            }
        }
        while(i < (nums.length-1) && nums[i] == nums[i+1]) i++;
    }
}
