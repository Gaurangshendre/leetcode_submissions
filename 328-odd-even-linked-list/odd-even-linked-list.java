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
    public ListNode oddEvenList(ListNode head) {
        ListNode oddd =new ListNode(0);
        ListNode evend =new ListNode(0);
        ListNode odd=oddd;
        ListNode even =evend;
        ListNode temp=head;
        int pos=1;
        while(temp!=null){
            if(pos%2!=0 ){
odd.next=temp;
odd=odd.next;
            }
            else{
                even.next=temp;
                even=even.next;
            }
            pos++;
            temp=temp.next;
        }
        
        even.next=null;
        odd.next=evend.next;
        return oddd.next;
    }
}