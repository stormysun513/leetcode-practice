public class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return false;
        }

        TreeSet<Long> set = new TreeSet<>();
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            Long floor = set.floor((long)num+t);
            Long ceiling = set.ceiling((long)num-t);
            if((floor != null && floor >= (long)num-t) || (ceiling != null && ceiling <= (long)num+t)) return true;
            set.add((long)num);
            if(i >= k){
                set.remove((long)nums[i-k]);
            }
        }
        return false;
    }
}
// Runtime NlogK
