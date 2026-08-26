class Solution {
    public Node copyRandomList(Node head) {
       Map<Node,Node>hash=new HashMap<>();
       Node cur =head;
       while(cur!=null){
        hash.put(cur,new Node(cur.val));
        cur=cur.next;
       }
       cur=head;
       while(cur!=null){
        Node copy =hash.get(cur);
        copy.next=hash.get(cur.next);
        copy.random=hash.get(cur.random);
        cur=cur.next;
       }
       return hash.get(head);

    }
}