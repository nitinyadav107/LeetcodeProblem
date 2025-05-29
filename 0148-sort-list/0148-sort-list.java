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
    ListNode mergeSort(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=null;
        ListNode head1=mergeSort(head);
        ListNode head2=mergeSort(slow);
        ListNode ans=merge(head1,head2);
        return ans;
    }
    ListNode merge(ListNode head1,ListNode head2){
        ListNode ans=new ListNode(-1);
        ListNode dummy=ans;
        while(head1!=null && head2!=null){
            if(head1.val<head2.val){
                ans.next=head1;
                head1=head1.next;
            }
            else{
                ans.next=head2;
                head2=head2.next;
            }
            ans=ans.next;
        }
        if(head1!=null) ans.next=head1;
        if(head2!=null) ans.next=head2;
        return dummy.next;
    }
    public ListNode sortList(ListNode head) {
        return mergeSort(head);
    }
}