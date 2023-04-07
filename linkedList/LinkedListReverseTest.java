package linkedList;

public class LinkedListReverseTest {
    
    public static Node reverseLinkedList(Node head){

        Node newHead= head;
        Node previousNode = null;
        while(newHead!=null){
            Node nextNode = newHead.next;
            newHead.next = previousNode;
            previousNode = newHead;
            newHead = nextNode;
        }

        return previousNode;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        Node n = reverseLinkedList(head);
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
