public class Solution {
    public String convertToBase7(int num) {
        StringBuilder sb = new StringBuilder();
        boolean neg = (num < 0);
        num = Math.abs(num);

        if(num == 0)
            return "0";

        while(num != 0){
            sb.append(Integer.toString(num%7));
            num /= 7;
        }
        if(neg){
            sb.append("-");
        }
        return sb.reverse().toString();
    }
}
