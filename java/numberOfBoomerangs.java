public class Solution {
    public int numberOfBoomerangs(int[][] points) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < points.length; i++){
            for(int j = 0; j < points.length; j++){
                if(j == i) continue;
                int d = distance(points[i], points[j]);
                map.put(d, map.getOrDefault(d, 0)+1);
            }
            for(Object val: map.values()){
                count += ((int)val*((int)val-1));
            }
            map.clear();
        }
        return count;
    }

    public int distance(int[] p1, int[] p2){
        return (p1[0]-p2[0])*(p1[0]-p2[0])+(p1[1]-p2[1])*(p1[1]-p2[1]);
    }
}
