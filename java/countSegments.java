public class Solution {
    public int countSegments2(String s) {
        if(s == null) return 0;
        String[] tokens = s.trim().split("\\s+");
        if(tokens.length == 1 && tokens[0].equals("")){
            return 0;
        }
        return tokens.length;
    }

    public int countSegments(String s) {
        int count = 0;
        int i = 0;
        int length = s.length();

        while(i < length){
            while(i < length && Character.isSpaceChar(s.charAt(i))) i++;
            int j = i;
            while(j+1 < length && !Character.isSpaceChar(s.charAt(j+1))) j++;
            if(j < length){
                count++;
            }
            i = j+1;
        }
        return count;
    }
}
