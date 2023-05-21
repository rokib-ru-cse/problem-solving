package linkedList;

public class InsertingANodeIntoASortedDoublyLinkedList {
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
        } else if (temp==null) {
            previous.setNext(newNode);
            newNode.setPrevious(previous);
        } else {
            previous.setNext(newNode);
            newNode.setNext(temp);
            newNode.setPrevious(previous);
        }
        return llist;
    }

    public static void main(String[] args) {
        InsertingANodeIntoASortedDoublyLinkedList list1 = new InsertingANodeIntoASortedDoublyLinkedList();
        list1.head = sortedInsert(list1.head, 5);
        list1.head = sortedInsert(list1.head, 2);
        list1.head = sortedInsert(list1.head, 3);
        list1.head = sortedInsert(list1.head, 4);
        list1.head = sortedInsert(list1.head, 6);

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
