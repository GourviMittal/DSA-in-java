1class Solution {
2
3    public ListNode swapPairs(ListNode head) {
4
5        ListNode dummy = new ListNode(0);
6        dummy.next = head;
7
8        ListNode prev = dummy;
9
10        while (
11            prev.next != null &&
12            prev.next.next != null
13        ) {
14
15            ListNode first = prev.next;
16            ListNode second = first.next;
17
18            first.next = second.next;
19            second.next = first;
20            prev.next = second;
21
22            prev = first;
23        }
24
25        return dummy.next;
26    }
27}