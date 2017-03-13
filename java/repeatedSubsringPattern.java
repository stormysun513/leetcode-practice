public class Solution {
    public boolean repeatedSubstringPattern(String str) {
        int i;
        int length = str.length();
        int[] table = new int[length];

        if(length <= 1){
            return false;
        }

        table[0] = -1;
        table[1] = 0;
        i = 2;
        while(i < length){
            int index = table[i-1];
            if(index >= 0 && index < length && str.charAt(index) == str.charAt(i-1)){
                table[i] = table[i-1]+1;
            }
            else if(str.charAt(0) == str.charAt(i-1)){
                table[i] = 1;
            }
            else{
                table[i] = 0;
            }
            i++;
        }
        int size = length - (table[length-1]+1);
        if(str.charAt(size-1) == str.charAt(length-1) && (table[length-1]+1)%size == 0){
            return true;
        }
        return false;
    }
}
