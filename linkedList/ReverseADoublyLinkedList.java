package linkedList;

public class ReverseADoublyLinkedList {
    DoublyLinkNode head;

    public static DoublyLinkNode sortedInsert(DoublyLinkNode llist, int data) {
        // Write your code here
        if (llist == null) {
            llist = new DoublyLinkNode(data);
            return llist;
        }
        DoublyLinkNode temp = llist;
        DoublyLinkNode previous = null;
        while (temp != null && (int) temp.data <= data) {
            previous = temp;
            temp = temp.getNext();
        }

        DoublyLinkNode newNode = new DoublyLinkNode(data);
        if (previous == null) {
            newNode.setNext(llist);
            llist.setPrevious(newNode);
            return newNode;
        } else if (temp == null) {
            previous.setNext(newNode);
            newNode.setPrevious(previous);
        } else {
            previous.setNext(newNode);
            newNode.setNext(temp);
            newNode.setPrevious(previous);
        }
        return llist;
    }
//    public static DoublyLinkNode reverse(DoublyLinkNode llist) {
//        // Write your code here
//        if (llist == null) {
//            return null;
//        }
//        DoublyLinkNode current = llist;
//        DoublyLinkNode previous = null;
//        while (current != null) {
//            DoublyLinkNode temp = current.getNext();
//            current.setNext(previous);
//            current.setPrevious(temp);
//            previous = current;
//            current = temp;
//        }
//        return previous;
//    }
static DoublyLinkNode reverse(DoublyLinkNode node) {

    DoublyLinkNode previous = null;
    DoublyLinkNode current = node;
    while (current != null) {
        DoublyLinkNode temp = current.next;

        current.next = previous;
        current.previous = temp;
        previous = current;
        current = temp;
    }
    return previous;
}
    public static void main(String[] args) {
        ReverseADoublyLinkedList list1 = new ReverseADoublyLinkedList();
        list1.head = sortedInsert(list1.head, 5);
        list1.head = sortedInsert(list1.head, 2);
        list1.head = sortedInsert(list1.head, 3);
        list1.head = sortedInsert(list1.head, 4);
        list1.head = sortedInsert(list1.head, 6);

        list1.print(list1.head);
        list1.head = reverse(list1.head);
        System.out.println();
        list1.print(list1.head);
    }

    private void print(DoublyLinkNode head) {
        DoublyLinkNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.getNext();
        }
    }


}
