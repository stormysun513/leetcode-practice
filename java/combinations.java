public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList();
        List<Integer> buf = new ArrayList();
        
        helper(1, n, k, buf, ans);
        return ans;
    }
    
    private void helper(int idx, int n, int remain, List<Integer> buf, List<List<Integer>> ans){
        if(remain == 0){
            ans.add(new ArrayList(buf));
            return;
        }
        
        if(idx > n){
            return;
        }
        
        int size = buf.size();
        for(int i = idx; i <= n; i++){
            buf.add(i);
            helper(i+1, n, remain-1, buf, ans);
            buf.remove(size);
        }
    }
}