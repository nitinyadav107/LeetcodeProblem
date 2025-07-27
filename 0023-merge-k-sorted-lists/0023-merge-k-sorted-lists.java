/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode merge(ListNode h1, ListNode h2) {
        ListNode a1 = h1;
        ListNode a2 = h2;
        ListNode l = new ListNode();
        ListNode head = l;
        while (a1 != null && a2 != null) {
            if (a1.val <= a2.val) {
                l.next = a1;
                l = l.next;
                a1 = a1.next;
            } else {
                l.next = a2;
                l = l.next;
                a2 = a2.next;
            }
        }
        if (a1 != null && a2 == null) {
            l.next = a1;
            // a1 = a1.next;
            // l = l.next;
        }
        if (a2 != null && a1 == null) {
            l.next = a2;
            // a2 = a2.next;
            // l = l.next;
        }
        return head.next;
    }

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode l1 = new ListNode(Integer.MIN_VALUE);
        for (int i = 0; i < lists.length; i++) {
            l1 = merge(l1, lists[i]);
        }
        return l1.next;
    }
}
