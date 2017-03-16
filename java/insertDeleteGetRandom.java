public class RandomizedSet {

    /** Initialize your data structure here. */
    public RandomizedSet() {
        map = new HashMap<>();
        arr = new ArrayList<>();
        rand = new Random();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        int idx = map.getOrDefault(val, -1);
        if(idx == -1){
            arr.add(val);
            map.put(val, arr.size()-1);
            return true;
        }
        return false;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        int idx = map.getOrDefault(val, -1);
        if(idx >= 0){
            int ele = arr.get(arr.size()-1);
            arr.set(idx, ele);
            arr.remove(arr.size()-1);
            map.put(ele, idx);
            map.remove(val);
            return true;
        }
        return false;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        int idx = rand.nextInt(arr.size());
        return arr.get(idx);
    }
    
    private ArrayList<Integer> arr;
    private HashMap<Integer, Integer> map;
    private Random rand;
}
