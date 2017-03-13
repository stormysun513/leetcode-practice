public class Solution {
    public int findComplement(int num) {
        int temp = num;
        temp |= (temp >>> 16);
        temp |= (temp >>> 8);
        temp |= (temp >>> 4);
        temp |= (temp >>> 2);
        temp |= (temp >>> 1);

        int mask = temp;
        return (~num)&mask;
    }
}
