c class Solution {
    public int hammingWeight(int n) {
        int cnt = 0;
        int temp = n;

        while(temp != 0){
            cnt += temp & 1;
            temp = temp >>> 1;
        }
        return cnt;
    }
}
