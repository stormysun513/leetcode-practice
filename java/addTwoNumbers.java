/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int c = 0;

        while(l1 != null||l2 != null||c > 0){
            int temp = c;
            if(l1 != null){
                temp += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                temp += l2.val;
                l2 = l2.next;
            }
            current.next = new ListNode(temp%10);
            current = current.next;
            c = temp/10;
        }
        return dummy.next;
    }
}
