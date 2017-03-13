public class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> tset = new TreeSet<>();

        for(int num: nums){
            tset.add(num);
            if(tset.size() > 3)
                tset.remove(tset.first());
        }
        if(tset.size() >= 3)
            return tset.first();
        else
            return tset.last();
    }
}
