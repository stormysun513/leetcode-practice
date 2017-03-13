public class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int cnt = 0;
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }
            else{
                map.put(nums[i], 1);
            }
            cnt++;
        }

        int bound = cnt/2;
        for(Map.Entry e: map.entrySet()){
            if((int)(e.getValue()) > bound){
                return (int)(e.getKey());
            }
        }
        return Integer.MIN_VALUE;
    }

    public int majorityElement2(int[] nums) {
        int majority = nums[1]; count = 1;

        for(int i = 1; i < nums.length; i++){
            if(count == 0){
                count++;
                majority = nums[i];
            }
            else if(majority == nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        return majority;
    }
}
