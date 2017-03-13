public class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        int i = 0;
        int ans = 0;

        while(i < A.length-2){
            int d = A[i+1]-A[i];
            int j = i+2;
            int count = 1;
            while(j < A.length && A[j] - A[j-1] == d){
                ans += count;
                count++;
                j++;
            }
            i = j - 1;
        }
        return ans;
    }
}
