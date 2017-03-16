public class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int length = s.length();
        
        if(k == 0){
            return s;
        }
        
        for(int i = 0; i < length; i+=(2*k)){
            if((i + k) <= length){
                StringBuilder temp = new StringBuilder(s.substring(i, (i + k)));
                sb.append(temp.reverse().toString());
                if(i + k < length){
                    if(i+2*k <= length){
                        sb.append(s.substring(i + k, (i + 2*k)));
                    }
                    else{
                        sb.append(s.substring(i + k));
                    }
                }
            }
            else{
                StringBuilder temp = new StringBuilder(s.substring(i));
                sb.append(temp.reverse().toString());
            }
        }
        return sb.toString();
    }
}