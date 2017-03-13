public class Solution {

    public int reverseBits(int n) {
        int temp = n;
        int result = 0;

        for(int i = 0; i < 32; i++){
            result = result << 1;
            result = result | (temp & 1);
            temp = temp >>> 1;
        }
        return result;
    }
}
