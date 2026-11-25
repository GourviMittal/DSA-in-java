
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prevGroup = dummy;

        while (true) {

            // Check whether k nodes are available
            ListNode kth = prevGroup;

            for (int i = 0; i < k && kth != null; i++) {
                kth = kth.next;
            }

            if (kth == null) {
                break;
            }

            // Store the node after the current group
            ListNode nextGroup = kth.next;

            // Reverse k nodes
            ListNode prev = nextGroup;
            ListNode curr = prevGroup.next;

            while (curr != nextGroup) {
                ListNode temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }

            // Connect the reversed group
            ListNode temp = prevGroup.next;
            prevGroup.next = kth;
            prevGroup = temp;
        }

        return dummy.next;
    }
}
