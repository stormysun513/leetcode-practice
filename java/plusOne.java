ipublic class Solution {
    public int[] plusOne(int[] digits) {
        int c = 1;
        int[] res;

        for(int i = digits.length-1; i >= 0; i--){
            c += digits[i];
            digits[i] = c%10;
            c /= 10;
        }

        if(c == 0){
            res = digits;
        }
        else{
            res = new int[digits.length+1];
            res[0] = c;
            for(int i = 0; i < digits.length; i++){
                res[i+1] = digits[i];
            }
        }
        return res;
    }
}
