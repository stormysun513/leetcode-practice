public class Solution {
    public String[] findRelativeRanks(int[] nums) {
        HashMap<Integer, String> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>(nums.length);
        int[] tmp = Arrays.copyOf(nums, nums.length);
        Arrays.sort(tmp);

        for(int i = 0; i < tmp.length/2; i++){
            int val = tmp[tmp.length-1-i];
            tmp[tmp.length-1-i] = tmp[i];
            tmp[i] = val;
        }

        for(int i = 0; i < tmp.length; i++){
            int num = tmp[i];
            if(i == 0) map.put(num, "Gold Medal");
            else if(i == 1) map.put(num, "Silver Medal");
            else if(i == 2) map.put(num, "Bronze Medal");
            else{
                map.put(num, Integer.toString(i+1));
            }
        }

        for(int num: nums){
            list.add(map.get(num));
        }
        return list.stream().toArray(String[]::new);
    }
}
