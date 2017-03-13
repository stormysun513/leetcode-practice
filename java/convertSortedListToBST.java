public class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null) return null;

        ListNode slow = head, fast = head.next, prev = null;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }

        if(prev != null) prev.next = null;

        TreeNode node = new TreeNode(slow.val);
        if(prev != null)
            node.left = sortedListToBST(head);
        else
            node.left = null;

        node.right = sortedListToBST(slow.next);
        return node;
    }
}
