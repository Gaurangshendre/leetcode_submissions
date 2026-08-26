/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempa=headA;
        ListNode tempb=headB;
        while(tempa!=tempb){
            if(tempa!=null){
                tempa=tempa.next;
            }else{
                tempa=headB;
            }
            if(tempb!=null){
                tempb=tempb.next;
            }else{
                tempb=headA;
            }
        }
        return tempa;
    }
}