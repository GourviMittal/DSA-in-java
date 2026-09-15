1class Solution {
2
3    public ListNode removeNthFromEnd(
4        ListNode head,
5        int n
6    ) {
7
8        ListNode dummy = new ListNode(0);
9        dummy.next = head;
10
11        ListNode fast = dummy;
12        ListNode slow = dummy;
13
14        for (int i = 0; i < n; i++) {
15            fast = fast.next;
16        }
17
18        while (fast.next != null) {
19
20            fast = fast.next;
21            slow = slow.next;
22        }
23
24        slow.next = slow.next.next;
25
26        return dummy.next;
27    }
28}