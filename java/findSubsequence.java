public class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        Set<List<Integer>> ans = new HashSet();
        List<Integer> buf = new ArrayList();
        
        helper(nums, 0, buf, ans);
        return new ArrayList(ans);
    }
    
    private void helper(int[] nums, int idx, List<Integer> buf, Set<List<Integer>> ans){
        int size = buf.size();
        if(size >= 2){
            ans.add(new ArrayList<Integer>(buf));
        }
        
        if(idx == nums.length){
            return;
        }
        
        int i = idx;
        int last;
        if(size == 0){
            last = Integer.MIN_VALUE;
        }
        else{
            last = buf.get(size-1);
        }
        
        while(i < nums.length){
            int num = nums[i];
            if(num >= last){
                buf.add(num);
                helper(nums, i+1, buf, ans);
                buf.remove(size);
            }
            i++;
        }
    }
}