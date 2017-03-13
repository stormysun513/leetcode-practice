public class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int i1 = num1.length()-1;
        int i2 = num2.length()-1;
        int c = 0;

        while(i1 >= 0 || i2 >= 0 || c != 0){
            int temp = c;
            if(i1 >= 0){
                temp += Character.getNumericValue(num1.charAt(i1));
                i1--;
            }
            if(i2 >= 0){
                temp += Character.getNumericValue(num2.charAt(i2));
                i2--;
            }
            sb.append((char)('0'+(temp%10)));
            c = temp /= 10;
        }
        return sb.reverse().toString();
    }
}
