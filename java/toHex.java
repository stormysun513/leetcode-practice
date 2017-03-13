public class Solution {
    public String toHex(int num) {
        int temp = num;
        StringBuilder sb = new StringBuilder();

        if(temp == 0){
            sb.append('0');
            return sb.toString();
        }

        while(temp != 0){
            int masked = temp & 0xF;
            if(masked <= 9){
                sb.append((char)('0'+masked));
            }
            else{
                sb.append((char)('a'+masked-10));
            }
            temp = temp >>> 4;
        }

        int end = sb.length()-1;
        while(sb.charAt(end) == '0'){
            sb.deleteCharAt(end);
            end--;
        }
        return sb.reverse().toString();
    }
}
