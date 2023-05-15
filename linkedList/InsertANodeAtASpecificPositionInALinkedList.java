package linkedList;

public class InsertANodeAtASpecificPositionInALinkedList {

    public static Node insertNodeAtPosition(Node llist, int data, int position) {
        Node node = new Node(data);
        int cnt = 0;
        Node temp = llist;
        Node previous = null;
        while (temp != null && cnt != position) {
            previous = temp;
            temp = temp.next;
            cnt++;
        }
        if (previous == null) {
            node.next = temp;
            return node;
        } else {
            previous.next = node;
            node.next = temp;
            return llist;
        }
    }

    public static void main(String[] args) {

    }
}
