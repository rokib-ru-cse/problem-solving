package linkedList;

public class InsertANodeeAtTheTailOfALinkedList {

    static Node insertNodeAtTail(Node head, int data) {

        if (head == null) {
            head = new Node(data);
            return head;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(data);
        temp = temp.next;
        return head;
    }

    public static void main(String[] args) {

    }
}
