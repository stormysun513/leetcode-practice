public class Solution {
    public String licenseKeyFormatting(String S, int K) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        char[] arr = S.toCharArray();

        for(int i = arr.length-1; i >= 0; i--){
            char ch = arr[i];
            if(ch != '-'){
                sb.append(Character.toString(Character.toUpperCase(ch)));
                count++;
            }
            if(count == K){
                sb.append(Character.toString('-'));
                count = 0;
            }
        }
        if(sb.length() > 0 && sb.charAt(sb.length()-1) == '-'){
            sb.setLength(sb.length()-1);
        }
        return sb.reverse().toString();
    }
}
