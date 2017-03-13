public class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
        int radius = 0;

        for(int pos: houses){
            int l = 0, r = heaters.length-1, mid = 0;
            int min = Integer.MAX_VALUE;
            while(l <= r){
                mid = l + (r-l)/2;
                if(pos == heaters[mid]){
                    min = 0;
                    break;
                }
                else if(pos < heaters[mid]){
                    r = mid - 1;
                    min = Math.min(min, heaters[mid]-pos);
                }
                else{
                    l = mid + 1;
                    min = Math.min(min, pos-heaters[mid]);
                }
            }
            radius = Math.max(radius, min);
        }
        return radius;
    }
}
