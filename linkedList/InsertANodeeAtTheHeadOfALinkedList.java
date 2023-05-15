package linkedList;

public class InsertANodeeAtTheHeadOfALinkedList {

    static Node insertNodeAtHead(Node llist, int data) {
        if (llist == null) {
            llist = new Node(data);
            return llist;
        }
        Node node = new Node(data);
        node.next = llist;
        return node;
    }

    public static void main(String[] args) {

    }
}
