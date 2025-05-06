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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    ListNode prev=null;
    ListNode findMid(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        prev=null;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            prev=slow;
            slow=slow.next;
        }
        return slow;
    }
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null) return null;
        ListNode mid=findMid(head);
        if (head == mid) return new TreeNode(head.val);
        if(prev!=null) prev.next=null;
        TreeNode x=new TreeNode(mid.val);
        x.left=sortedListToBST(head);
        x.right=sortedListToBST(mid.next);
        return x;
    }
}