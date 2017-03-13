/**
 *  * Definition for singly-linked list.
 *   * class ListNode {
 *    *     int val;
 *     *     ListNode next;
 *      *     ListNode(int x) {
 *       *         val = x;
 *        *         next = null;
 *         *     }
 *          * }
 *           */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow, fast;

        if(head == null || head.next == null){
            return null;
        }
        slow = head.next;
        fast = head.next.next;

        while(fast != null && fast.next != null && fast != slow){
            fast = fast.next.next;
            slow = slow.next;
        }
        if(slow == fast){
            slow = head;
            while(slow != fast){
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }
        else{
            return null;
        }
    }
}
