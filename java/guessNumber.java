public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int i = 1, j = n;

        while(i <= j){
            int mid = i + (j-i)/2;
            int result = guess(mid);

            if(result == 0){
                return mid;
            }
            else if(result == 1){
                i = mid+1;
            }
            else{
                j = mid-1;
            }
        }
        return -1;
    }
}
