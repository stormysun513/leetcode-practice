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
    public boolean hasCycle(ListNode head) {
        ListNode slow, fast;

        if(head == null || head.next == null){
            return false;
        }
        slow = head.next;
        fast = head.next.next;
        while(fast != null && fast.next != null && fast != slow){
            fast = fast.next.next;
            slow = slow.next;
        }
        return (fast == slow);
    }
}
