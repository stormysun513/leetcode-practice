public class Solution {
    public String frequencySort(String s) {
        int length = s.length();
        int[] table = new int[256];
        char[] arr = new char[length];

        for(char c: s.toCharArray()){
            table[c]++;
        }

        char idx = 0;
        int count = 0;
        while(count < length){
            int max = 0;
            for(char i = 0; i < 256; i++){
                if(table[i] > max){
                    max = table[i];
                    idx = i;
                }
            }
            if(max > 0){
                int temp = table[idx];
                while(temp > 0){
                    arr[count++] = idx;
                    temp--;
                }
                table[idx] = 0;
            }
        }
        return new String(arr);
    }
}
