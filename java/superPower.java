public class Solution {
    public int superPow(int a, int[] b) {
        int pow = a % 1337;
        int ans = 1;
        
        for(int i = b.length-1; i >= 0; i--){
            int num = b[i];
            
            int temp = pow;
            for(int j = 1; j < num; j++){
                temp = (temp * pow) % 1337;
            }
            if(num != 0){
                ans = (ans * temp)% 1337;
            }
            int temp2 = (pow*pow) % 1337;
            int temp4 = (temp2*temp2) % 1337;
            int temp8 = (temp4*temp4) % 1337;
            pow = (temp2*temp8) % 1337;
        }
        return ans;
    }
}