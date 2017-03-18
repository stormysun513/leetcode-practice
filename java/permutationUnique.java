public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        List<Integer> buf = new ArrayList();
        boolean[] flags = new boolean[nums.length];
        
        Arrays.sort(nums);
        helper(nums, flags, buf, ans);
        return ans;
    }
    
    private void helper(int[] nums, boolean[] flags, List<Integer> buf, List<List<Integer>> ans){
        
        int size = buf.size();
        if(size == nums.length){
            ans.add(new ArrayList(buf));
            return;
        }
        
        int i = 0;
        while(i < nums.length){
            int num = nums[i];
            if(!flags[i]){
                flags[i] = true;
                buf.add(num);
                helper(nums, flags, buf, ans);
                buf.remove(size);
                flags[i] = false;
                while(i+1 < nums.length && nums[i+1] == nums[i]) i++;
            }
            i++;
        }
    }
}