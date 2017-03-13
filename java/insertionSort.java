public class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        dummy.next = head;
        ListNode p = dummy.next;
        ListNode prev = dummy;

        while(p != null){
            if(prev.val > p.val){
                ListNode target = p;
                prev.next = p.next;
                p = p.next;

                ListNode pp = dummy;
                ListNode pprev = null;
                while(pp.val <= target.val){
                    pprev = pp;
                    pp = pp.next;
                }

                pprev.next = target;
                target.next = pp;
                if(prev.next != p) prev = prev.next;
            }
            else{
                prev = p;
                p = p.next;
            }
        }
        return dummy.next;
    }
}
