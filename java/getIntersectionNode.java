/**
 *  * Definition for singly-linked list.
 *   * public class ListNode {
 *    *     int val;
 *     *     ListNode next;
 *      *     ListNode(int x) {
 *       *         val = x;
 *        *         next = null;
 *         *     }
 *          * }
 *           */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = 1;
        int lengthB = 1;
        ListNode tempA = headA;
        ListNode tempB = headB;
        int diff;

        if(tempA == null || tempB == null) return null;

        while(tempA != null && tempA.next != null){
            lengthA++;
            tempA = tempA.next;
        }
        while(tempB != null && tempB.next != null){
            lengthB++;
            tempB = tempB.next;
        }
        if(tempB != tempA) return null;

        diff = Math.abs(lengthA-lengthB);
        tempA = headA;
        tempB = headB;
        if(lengthA >= lengthB){
            while(diff > 0){
                tempA = tempA.next;
                diff--;
            }
        }
        else{
            while(diff > 0){
                tempB = tempB.next;
                diff--;
            }
        }
        while(tempA != null){
            if(tempA == tempB) return tempA;
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return null; // Should not enter here
    }
}
