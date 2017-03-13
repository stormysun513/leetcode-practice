public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        TreeMap<Integer, List<Integer>> tmap = new TreeMap<>();
        List<Integer> ans = new ArrayList<>();

        for(int num: nums){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }
            else{
                map.put(num, 1);
            }
        }

        for(int key: map.keySet()){
            int count = map.get(key);
            if(tmap.containsKey(count)){
                List<Integer> list = tmap.get(count);
                list.add(key);
            }
            else{
                List<Integer> list = new ArrayList<Integer>();
                list.add(key);
                tmap.put(count, list);
            }
        }

        while(k > 0 && !tmap.isEmpty()){
            Map.Entry<Integer, List<Integer>> entry = tmap.lastEntry();
            Iterator<Integer> it = entry.getValue().iterator();
            while(k > 0 && it.hasNext()){
                ans.add(it.next());
                k--;
            }
            tmap.remove(entry.getKey());
        }
        return ans;
    }
}
