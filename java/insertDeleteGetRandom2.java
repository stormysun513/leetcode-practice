public class RandomizedCollection {

    /** Initialize your data structure here. */
    public RandomizedCollection() {
        arr = new ArrayList<>();
        map = new HashMap<>();
        rand = new Random();
    }
    
    /** Inserts a value to the collection. Returns true if the collection did not already contain the specified element. */
    public boolean insert(int val) {
        HashSet<Integer> set = map.getOrDefault(val, null);
        arr.add(val);
        if(set == null){
            set = new HashSet<>();
            set.add(arr.size()-1);
            map.put(val, set);
            return true;
        }
        else{
            set.add(arr.size()-1);
            return false;
        }
    }
    
    /** Removes a value from the collection. Returns true if the collection contained the specified element. */
    public boolean remove(int val) {
        HashSet<Integer> set = map.getOrDefault(val, null);
        if(set != null){
            Iterator<Integer> iters = set.iterator();
            assert iters.hasNext();
            
            int idx = (int)(iters.next());
            int ele = arr.get(arr.size()-1);
            
            arr.set(idx, ele);
            set.remove(idx);
            
            HashSet<Integer> ano_set = map.get(ele);
            ano_set.remove(arr.size()-1);
            ano_set.add(idx);
            arr.remove(arr.size()-1);
            
            if(!iters.hasNext()){
                map.remove(val);
            }
            return true;
        }
        return false;
    }
    
    /** Get a random element from the collection. */
    public int getRandom() {
        return arr.get(rand.nextInt(arr.size()));
    }
    
    private ArrayList<Integer> arr;
    private HashMap<Integer, HashSet<Integer>> map;
    private Random rand;
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */