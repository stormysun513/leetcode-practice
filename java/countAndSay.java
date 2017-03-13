public class Solution {
    public String countAndSay(int n) {
        StringBuilder sb = new StringBuilder();
        StringBuilder ans = new StringBuilder();

        if(n <= 0) return "";

        sb.append('1');
        for(int i = 1; i < n; i++){
            int length = sb.length();
            int k = 0;

            while(k < length){
                int count = 1;
                char ch = sb.charAt(k);
                while(k + 1 < length && sb.charAt(k+1) == ch){
                    k++;
                    count++;
                }
                ans.append(String.format("%d%c", count, ch));
                k++;
            }
            sb = ans;
            ans = new StringBuilder();
        }
        return sb.toString();
    }
}
