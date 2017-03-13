public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        return subsetsHelper(nums, 0);
    }

    public List<List<Integer>> subsetsHelper(int[] nums, int idx){
        List<List<Integer>> ans = new ArrayList<>();
        if(idx == nums.length) {
            List<Integer> empty = new ArrayList<>();
            ans.add(empty);
            return ans;
        }

        List<List<Integer>> subs = subsetsHelper(nums, idx+1);
        for(List<Integer> set: subs){
            List<Integer> newset = new ArrayList<>(set);
            newset.add(nums[idx]);
            ans.add(set);
            ans.add(newset);
        }
        return ans;
    }
}
