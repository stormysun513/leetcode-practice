public class Solution {
    public String getPermutation(int n, int k) {
        StringBuilder sb = new StringBuilder();
        List<Integer> buf = new ArrayList(n);
        int[] table = new int[n+1];
        
        buf.add(1);
        table[0] = table[1] = 1;
        for(int i = 2; i <= n; i++){
            table[i] = table[i-1]*i;
            buf.add(i);
        }
        
        int temp = k-1;
        int order = n-1;
        while(order >= 0){
            int idx = temp/table[order];
            int num = buf.get(idx);
            buf.remove(idx);
            sb.append(Integer.toString(num));
            temp = temp % table[order];
            order--;
        }
        
        return sb.toString();
    }
}