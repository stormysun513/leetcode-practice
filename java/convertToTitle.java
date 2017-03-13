public class Solution {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        int temp = n;

        while(temp != 0){
            int remain = temp % 26;
            if(remain == 0){
                remain = 26;
                temp = temp/26 - 1;
            }
            else{
                temp /= 26;
            }
            remain = (remain == 0)? 26: remain;
            sb.append(Character.toString((char)('A'-1+remain)));
        }
        return sb.reverse().toString();
    }
}
