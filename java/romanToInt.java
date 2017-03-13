public class Solution {
    public int romanToInt(String s) {
        int i = s.length() - 1;
        int num = 0;

        while(i >= 0){
            char ch = s.charAt(i);
            switch (ch){
                case 'I':
                    num += (num >= 5) ? -1 : 1;
                    break;
                case 'V':
                    num += 5;
                    break;
                case 'X':
                    num += (num >= 50)? -10 : 10;
                    break;
                case 'L':
                    num += 50;
                    break;
                case 'C':
                    num += (num >= 500)? -100 : 100;
                    break;
                case 'D':
                    num += 500;
                    break;
                case 'M':
                    num += 1000;
                    break;
                default:
                    throw new IllegalArgumentException();
            }
            i--;
        }
        return num;
    }
}
