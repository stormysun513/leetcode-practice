public class Solution {
    public int myAtoi(String str) {
        String temp = str.trim();
        int length = temp.length();
        long ans = 0;
        int count = 0;
        int front = 0;
        char c;
        boolean neg = false;

        if(length == 0){
            return 0;
        }

        c = temp.charAt(0);
        if(!Character.isDigit(c)){
            if(c == '-') {
                neg = true;
                front++;
            }
            else if(c == '+') {
                neg = false;
                front++;
            }
            else {
                return 0;
            }
        }
        for(int i = front; i < length; i++){
            if(!Character.isDigit(temp.charAt(i))){
                break;
            }
            ans *= 10;
            ans += Character.getNumericValue(temp.charAt(i));
            count++;
        }
        if((!neg && ans > 2147483647L) || (neg && ans > 2147483648L) || (count > 10)){
            if(!neg){
                ans = 2147483647L;
            }
            else{
                ans = -2147483648L;
            }
        }

        if(neg){
            return (int)(ans*(-1L));
        }
        return (int)ans;
    }

    public int myAtoi2(String str) {
        if (str.isEmpty()) return 0;
        int sign = 1, base = 0, i = 0;
        while (str.charAt(i) == ' ')
            i++;
        if (str.charAt(i) == '-' || str.charAt(i) == '+')
            sign = str.charAt(i++) == '-' ? -1 : 1;
        while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            if (base > Integer.MAX_VALUE / 10 || (base == Integer.MAX_VALUE / 10 && str.charAt(i) - '0' > 7)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            base = 10 * base + (str.charAt(i++) - '0');
        }
        return base * sign;
    }
}
