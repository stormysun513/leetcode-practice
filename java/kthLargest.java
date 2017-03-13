public class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue(k, Collections.reverseOrder());
        int ans = -1;

        for(int num: nums) pq.offer(num);
        while(k > 0) {
            ans = pq.poll();
            k--;
        }
        return ans;
    }
}
