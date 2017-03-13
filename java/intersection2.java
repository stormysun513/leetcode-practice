public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] ans;
        List<Integer> list = new LinkedList<Integer>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int num: nums1){
            if(map.containsKey(num)){
                int value = map.get(num);
                map.put(num, value+1);
            }
            else{
                map.put(num, 1);
            }
        }

        for(int num: nums2){
            if(map.containsKey(num)){
                int value = map.get(num);
                if(value == 1){
                    map.remove(num);
                }
                else{
                    map.put(num, value-1);
                }
                list.add(num);
            }
        }

        ans = new int[list.size()];
        for(int i = 0; i < ans.length; i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}
