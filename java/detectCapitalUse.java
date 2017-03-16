public class Solution {
    public boolean detectCapitalUse(String word) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        
        if(word == null || word.equals(""))
            return true;
        
        for(char c: word.toCharArray()){
            sb1.append(Character.toUpperCase(c));
            sb2.append(Character.toLowerCase(c));
        }
        
        if(sb1.toString().equals(word)){
            return true;
        }
        if(sb2.toString().equals(word)){
            return true;
        }
        if(sb1.charAt(0) == word.charAt(0) && word.substring(1).equals(sb2.substring(1))){
            return true;
        }
        return false;
    }
}