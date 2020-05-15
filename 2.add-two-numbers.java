/**
 * @author Vicky
 * @email vickysaha107@gmail.com
 * @create date 14-05-2020 13:28:43
 * @modify date 14-05-2020 13:28:43
 * @desc [description]
 */

/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode Pointer1=l1;
        ListNode Pointer2=l2;
        ListNode Result=new ListNode(0);
        ListNode ResultPointer=Result;
        int sum=0;
        int digitValue=0;
        int carry=0;
        while (Pointer1!=null||Pointer2!=null||carry!=0) {
            ResultPointer.next=new ListNode(0);
            ResultPointer=ResultPointer.next;
            sum=0;
            if(Pointer1!=null){
                sum=sum+Pointer1.val;
                Pointer1=Pointer1.next;
            }
            if(Pointer2!=null){
                sum=sum+Pointer2.val;
                Pointer2=Pointer2.next;
            }
             sum=sum+carry;
             digitValue=sum%10;
             carry=sum/10;
             ResultPointer.val=digitValue;   
            }
            return Result.next; 
    }
}
// @lc code=end

