public class Solution {
    public boolean isPalindrome(String s) {
        char[] arr = s.toCharArray();
        int i = 0, j = arr.length-1;

        while(i < j){
            while(i < arr.length-1 && !Character.isLetterOrDigit(arr[i])) i++;
            while(j >= 0 && !Character.isLetterOrDigit(arr[j])) j--;

            if(i < arr.length-1 && j >= 0 && Character.toLowerCase(arr[j]) != Character.toLowerCase(arr[i])) return false;
            j--;
            i++;
        }
        return true;
    }
}
