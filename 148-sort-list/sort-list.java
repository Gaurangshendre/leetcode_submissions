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
    public ListNode sortList(ListNode head) {
        if(head==null){
            return head; 
        }
        ListNode temp=new ListNode(0);
        temp=head;
        ArrayList<Integer>k=new ArrayList<>();
    while(temp!=null){
            k.add(temp.val);
            temp=temp.next;
    }
        
        Collections.sort(k);
        head= new ListNode(k.get(0));
        temp=head;
        for(int i =1;i<k.size();i++){
            temp.next= new ListNode(k.get(i));
            temp=temp.next;
        }
return head;
    }
}