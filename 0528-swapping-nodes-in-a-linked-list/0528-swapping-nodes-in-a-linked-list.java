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
    int size(ListNode head){
        int size=0;
        while(head!=null){
            size++;
            head=head.next;
        }
        System.out.print(size);
        return size;
    }
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp=head;
        int c=1;
        int val1=head.val;
        int val2=head.val;
        int size=size(head);
        while(temp!=null){
            temp=temp.next;
            c++;
            if(c==k){
                val1=temp.val;
            }
            if(size-k+1==c){
                val2=temp.val;
            }
        }
        ListNode temp2=head;
        c=1;
        while(temp2!=null){
            if(c==k){
                temp2.val=val2;
            }
            if(c==size-k+1){
                temp2.val=val1;
            }
            temp2=temp2.next;
            c++;
        }
        return head;

    }
}