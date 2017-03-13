public class Solution {
    public int magicalString(int n) {
        if(n <= 0) return 0;
        if(n <= 3) return 1;
        if(n <= 4) return 2;
        if(n <= 5) return 3;

        int count = 3;
        int target = n - 5;
        String temp = "11";
        int curr = 1;
        StringBuilder sb = new StringBuilder();

        while(target > 0){
            for(char ch: temp.toCharArray()){
                char app = (char)('1'+ curr);
                if(ch == '1'){
                    sb.append(Character.toString(app));
                    target--;
                    count = (app == '1')? count + 1 : count;
                    if(target == 0) return count;
                }
                else{
                    sb.append(Character.toString(app));
                    target--;
                    count = (app == '1')? count + 1 : count;
                    if(target == 0) return count;

                    sb.append(Character.toString(app));
                    target--;
                    count = (app == '1')? count + 1 : count;
                    if(target == 0) return count;
                }
                curr ^= 1;
            }
            temp = sb.toString();
            sb.setLength(0);
        }
        return count;
    }
}
