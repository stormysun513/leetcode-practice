public class Solution {
    public int nthUglyNumber(int n) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(n, Collections.reverseOrder());
        Set set = new HashSet();

        if(n == 0){
            return -1;
        }
        getUglyNumRecursive(n, 1, pq, set);
        int temp = pq.peek();
        return temp;
    }

    public void getUglyNumRecursive(int n, long temp, PriorityQueue<Integer> pq, Set set){
        if(set.contains((int)temp)) return;
        if(temp >= Integer.MAX_VALUE) return;

        if(pq.size() >= n){
            if(pq.peek() <= temp){
                return;
            }
            else{
                pq.poll();
                pq.add((int)temp);
            }
        }
        else{
            pq.add((int)temp);
        }
        set.add((int)temp);

        getUglyNumRecursive(n, temp*2, pq, set);
        getUglyNumRecursive(n, temp*3, pq, set);
        getUglyNumRecursive(n, temp*5, pq, set);
    }

    public int nthUglyNumber2(int n) {
        if(n <= 0) return -1;

        int[] table = new int[n];
        int t2, t3, t5;

        t2 = t3 = t5 =0;
        table[0] = 1;
        for(int i = 1; i < n; i++){
            int temp = Math.min(table[t2]*2, Math.min(table[t3]*3, table[t5]*5));
            if(temp == table[t2]*2) t2++;
            if(temp == table[t3]*3) t3++;
            if(temp == table[t5]*5) t5++;
            table[i] = temp;
        }
        return table[n-1];
    }
}
