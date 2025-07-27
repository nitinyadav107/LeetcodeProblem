/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        // ListNode slow=head;
        // ListNode fast=head;
        // ListNode newpointer=head;
        // while(fast!=null && fast.next!=null){
        //     slow=slow.next;
        //     fast=fast.next.next;
        //     if(slow==fast  ){
        //         while(fast!=newpointer){
        //             fast=fast.next;
        //              newpointer=newpointer.next;    
        //         }
        //         return fast;
        //     }
            
        // }
        // return null;

        HashSet<ListNode> map=new HashSet<>();
        while(head!=null){
            ListNode temp=head;
            if(!map.contains(temp)){
                map.add(temp);
            }
            else{
                return temp;
            }
            head=head.next;
            
        }
        return null;
        
    
    
    
    }
}