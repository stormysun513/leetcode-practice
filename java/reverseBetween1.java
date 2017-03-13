class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        Stack<ListNode> stack = new Stack<>();
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy, curr = head;
        dummy.next = head;
        int idx = 1;

        while(curr != null && idx <= n){
            if(idx >= m){
                stack.push(curr);
            }
            if(idx+1 <= m){
                prev = curr;
            }
            curr = curr.next;
            idx++;
        }

        ListNode temp = prev;
        while(!stack.empty()){
            ListNode top = stack.pop();
            temp.next = top;
            temp = temp.next;
        }
        temp.next = curr;
        return dummy.next;
    }
}
