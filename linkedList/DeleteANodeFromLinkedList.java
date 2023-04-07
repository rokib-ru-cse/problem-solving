package linkedList;

public class DeleteANodeFromLinkedList {
    
    public static Node deleteANodeFromLinkedList(Node head,int data){
        Node newhead = head;
        Node previous = null;
        if(newhead.value==data){
            return newhead.next;
        }
        while(newhead!=null){
            
            if(newhead.value==data){
                previous.next=newhead.next;
                return head; 
            }
            previous = newhead;
            newhead = newhead.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        Node n = deleteANodeFromLinkedList(head,4);
        while (n != null) {
            if (n.next == null) {
                System.out.print(n.value);

            } else {
                System.out.print(n.value + "->");
            }
            n = n.next;
        }
        System.out.println();
    }
}
