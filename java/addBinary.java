public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        int c = 0;

        while(i >= 0 || j >= 0 || c > 0){
            int temp = c;
            if(i >= 0){
                char ch = a.charAt(i);
                temp += (ch - '0');
                i--;
            }
            if(j >= 0){
                char ch = b.charAt(j);
                temp += (ch - '0');
                j--;
            }
            sb.append(Integer.toString(temp&1));
            c = (temp >>> 1)&1;
        }
        if(sb.length() == 0){
            return "0";
        }
        return sb.reverse().toString();
    }
}
