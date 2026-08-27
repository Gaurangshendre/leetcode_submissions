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
    public ListNode deleteMiddle(ListNode head) {
         if(head==null)return head;
        ListNode temp=head;
        int len =0;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
      
        temp=head;
        for(int i =1;i<(len/2);i++){
temp=temp.next;
        }
        if(temp.next==null){
            return head.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}