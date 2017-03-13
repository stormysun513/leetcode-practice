public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> base = new ArrayList<Integer>();
        if(numRows <= 0){
            return ans;
        }

        base.add(1);
        ans.add(base);
        for(int i = 2; i <= numRows; i++){
            List<Integer> tail = ans.get(ans.size()-1);
            List<Integer> new_list = new ArrayList<Integer>();
            int length = tail.size();

            new_list.add(1);
            for(int j = 0; j < length-1; j++){
                new_list.add(tail.get(j)+tail.get(j+1));
            }
            new_list.add(1);
            ans.add(new_list);
        }
        return ans;
    }
}
