/**
 *  * Definition for singly-linked list.
 *   * public class ListNode {
 *    *     int val;
 *     *     ListNode next;
 *      *     ListNode(int x) { val = x; }
 *       * }
 *        */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;

        if(head == null){
            return null;
        }
        dummy.next = head;
        while(prev.next != null && prev.next.next != null){
            ListNode temp = prev.next;
            prev.next = prev.next.next;
            temp.next = prev.next.next;
            prev.next.next = temp;
            prev = temp;
        }
        return dummy.next;
    }
}
