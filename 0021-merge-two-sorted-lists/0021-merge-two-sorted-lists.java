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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode prev = list1;
        ListNode curr = list2;
        ListNode Head = new ListNode();
        ListNode head = Head;

        while (prev != null && curr != null) {
            if (prev.val <= curr.val) {
                head.next = prev;
                prev = prev.next;
            } else {
                head.next = curr;
                curr = curr.next;
            }
            head = head.next; 
        }

        if(prev != null) {
            head.next = prev;
          
        }

        if (curr != null) {
            head.next = curr;
        }

        return Head.next;
    }
}
