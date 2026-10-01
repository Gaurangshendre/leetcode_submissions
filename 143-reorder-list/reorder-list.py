# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def reorderList(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: None Do not return anything, modify head in-place instead.
        """
        if head ==None or head.next ==None:
            return head
        fast=head
        slow=head
        while fast and fast.next:
            slow=slow.next
            fast=fast.next.next
        prev=None
        curr=slow.next
        slow.next=  None
        while curr:
            nxt = curr.next 
            curr.next = prev 
            prev = curr
            curr = nxt
        first=head
        second=prev
        while second:
            temp1=first.next
            temp2=second.next
            first.next=second
            second.next=temp1
            first =temp1
            second=temp2
        return head
                




        