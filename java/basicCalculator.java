public class Solution {
    public int calculate(String s) {
        s = s.trim();

        int length = s.length();
        Stack<Integer> stack = new Stack();
        int i = 0, ans = 0;

        if(length == 0) return 0;
        while(i+1 < length && Character.isDigit(s.charAt(i+1))) i++;
        stack.push(Integer.parseInt(s.substring(0, ++i)));

        while(i < length){
            while(i < length && Character.isSpaceChar(s.charAt(i))) i++;
            char op = s.charAt(i);

            int j = i+1;
            while(j < length && Character.isSpaceChar(s.charAt(j))) j++;

            i = j;
            while(j+1 < length && Character.isDigit(s.charAt(j+1))) j++;
            int value = Integer.parseInt(s.substring(i, ++j));

            switch (op){
                case '+':
                    stack.push(value);
                    break;
                case '-':
                    stack.push(-1*value);
                    break;
                case '*':
                    stack.push(stack.pop()*value);
                    break;
                case '/':
                    stack.push(stack.pop()/value);
                    break;
            }
            i = j;
        }

        for(int num: stack){
            ans += num;
        }
        return ans;
    }
}
