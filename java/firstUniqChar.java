public class Solution {
    public int firstUniqChar(String s) {
        int length = s.length();
        int[] cnt = new int[256];
        int[] idx = new int[256];
        int min = Integer.MAX_VALUE;
        int ans = -1;

        for(int i = 0; i < length; i++){
            char c = s.charAt(i);
            cnt[c]++;
            idx[c] = i;
        }
        for(int i = 0; i < 256; i++){
            if(cnt[i] == 1 && idx[i] < min){
                min = idx[i];
                ans = idx[i];
            }
        }
        return ans;
    }
}
