public class Solution {
    public int maxRotateFunction(int[] A) {
        if(A == null) return 0;

        int length = A.length;
        int temp = 0;
        int sum = 0;
        int max;
        for(int i = 0; i < length; i++){
            temp += i*A[i];
            sum += A[i];
        }

        max = temp;
        for(int i = 1; i < length; i++){
            temp = temp + sum - length*A[length-i];
            max = Math.max(max, temp);
        }
        return max;
    }
}
