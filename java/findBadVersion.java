public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int i = 0, j = n, last_good = -1;

        while(i < j){
            int mid = i + (j-i)/2;

            if(isBadVersion(mid)){
                j = mid - 1;
            }
            else{
                i = mid + 1;
                last_good = mid;
            }
        }

        while(!isBadVersion(last_good+1))last_good++;
        return last_good + 1;
    }
}
