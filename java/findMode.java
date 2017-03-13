public class Solution {
    public int[] findMode(TreeNode root) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        int num = dfsFindModeHelper(root, map);
        for(int i = 0; i < num; i++){
            list.add(new ArrayList<Integer>());
        }

        for(Map.Entry e: map.entrySet()){
            ArrayList arrlist = list.get((int)e.getValue()-1);
            arrlist.add(e.getKey());
        }

        int i = num-1;
        while(i >= 0 && list.get(i).size() == 0) i--;
        if(i >= 0){
            return (int[])list.get(i).stream().mapToInt(j->j).toArray();
        }
        return new int[0];
    }

    public int dfsFindModeHelper(TreeNode node, HashMap map){
        if(node == null) return 0;

        int sum = 1;
        int count = (int)map.getOrDefault(node.val, 0);
        map.put(node.val, count+1);
        sum += dfsFindModeHelper(node.left, map);
        sum += dfsFindModeHelper(node.right, map);
        return sum;
    }
}
