public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int j = 0;
        int count = 0;
        for(int i = 0; i < g.length; i++){
            int target = g[i];
            while(j < s.length && s[j] < target){
                j++;
            }

            if(j < s.length){
                count++;
                j++;
            }
        }

        if(j < s.length){
            return g.length;
        }
        else{
            return count;
        }
    }
}
