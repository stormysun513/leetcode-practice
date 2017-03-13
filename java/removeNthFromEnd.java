public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        removeNthFromEndHelper(dummy, head, n);
        return dummy.next;
    }

    public int removeNthFromEndHelper(ListNode prev, ListNode node, int n){
        if(node == null) return 0;
        int index = 1 + removeNthFromEndHelper(node, node.next, n);

        if(index == n){
            prev.next = node.next;
        }
        return index;
    }
}
