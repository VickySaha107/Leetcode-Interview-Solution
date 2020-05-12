/*
 * @lc app=leetcode id=206 lang=java
 *
 * [206] Reverse Linked List
 */

// @lc code=start
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
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode Current=head;
            ListNode Previous=null;
        ListNode Next=null;
        while(Current!=null){
           Next=Current.next;
            Current.next=null;
            Current.next=Previous;
            Previous=Current;
            Current=Next;
        }  
        return Previous; 
    }
}
// @lc code=end

