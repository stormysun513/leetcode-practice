public class Solution {
    public int titleToNumber(String s) {
        int num = 0;
        int index = 0;
        int length = s.length();

        while(index < length){
            char c = s.charAt(index);
            num = num*26 + (c-'A')+1;
            index++;
        }

        return num;
    }
}
