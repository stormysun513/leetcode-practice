public class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int i = 0, j = arr.length-1;

        // System.out.println(arr);
        while(i < j){
            while(i < arr.length && !isVowel(arr[i])) i++;
            while(j >= 0 && !isVowel(arr[j])) j--;
            if(i < j){
                // System.out.println(i + ", " + j);
                char tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        }
        return String.valueOf(arr);
    }
    public boolean isVowel(char c){
        char tmp = Character.toUpperCase(c);

        if(tmp == 'A' || tmp == 'E' || tmp == 'I' || tmp == 'O' || tmp == 'U'){
            return true;
        }
        return false;
    }
}
