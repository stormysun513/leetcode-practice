/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        ListNode curr = head;

        dummy.next = head;
        while(curr != null){
            if(curr.val == val){
                curr = curr.next;
                prev.next = curr;
            }
            else{
                prev = curr;
                curr = curr.next;
            }
        }

        return dummy.next;
    }
}
