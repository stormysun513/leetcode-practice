public class Solution {
    class Element {
        public int value;
        public int index;

        public Element(int v, int idx){
            value = v;
            index = idx;
        }

        public int getValue(){
            return value;
        }

        public int getIndex(){
            return index;
        }
    }

    public int[] nextGreaterElements(int[] nums) {
        Stack<Element> stack = new Stack<>();
        int[] ans = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            while(!stack.empty() && stack.peek().getValue() < num){
                Element ele = stack.pop();
                ans[ele.getIndex()] = num;
            }
            stack.push(new Element(num, i));
        }

        for(int i = 0; i < nums.length-1; i++){
            int num = nums[i];
            while(!stack.empty() && stack.peek().getValue() < num){
                Element ele = stack.pop();
                ans[ele.getIndex()] = num;
            }
        }

        while(!stack.empty()){
            Element ele = stack.pop();
            ans[ele.getIndex()] = -1;
        }
        return ans;
    }
}
