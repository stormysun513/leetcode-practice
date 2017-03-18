public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> bag = new ArrayList<Integer>();
        
        Arrays.sort(candidates);
        helper(candidates, 0, target, bag, ans);
        return ans;
    }
    
    public void helper(int[] candidates, int idx, int remain, List<Integer> bag, List<List<Integer>> ans){
        if(remain < 0){
            return;
        }
        if(remain == 0){
            ans.add(new ArrayList<Integer>(bag));
            return;
        }
        
        int size = bag.size();
        for(int i = idx; i < candidates.length; i++){
            int num = candidates[i];
            bag.add(num);
            helper(candidates, i, remain-num, bag, ans);
            bag.remove(size);
        }
    }
}