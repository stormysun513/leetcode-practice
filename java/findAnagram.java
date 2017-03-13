public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] win = new int[256];
        int[] tbl = new int[256];
        int length = p.length();
        int bound = s.length();
        List<Integer> ans = new LinkedList<Integer>();
        if(length > bound){
            return ans;
        }

        for(char c: p.toCharArray()){
            tbl[c]++;
        }
        for(int i = 0; i < length-1; i++){
            win[s.charAt(i)]++;
        }

        for(int i = length-1; i < bound; i++){
            win[s.charAt(i)]++;
            if(checkWin(win, tbl)){
                ans.add(i-(length-1));
            }
            win[s.charAt(i-(length-1))]--;
        }
        return ans;
    }

    public boolean checkWin(int[] win, int[] tbl){
        for(int i = 0; i < 256; i++){
            if(win[i] != tbl[i]){
                return false;
            }
        }
        return true;
    }
}
