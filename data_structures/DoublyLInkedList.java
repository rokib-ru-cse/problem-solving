import javax.swing.text.PlainView;

/**
 * DoublyLInkedList
 */
public class DoublyLInkedList {

    private int length;
    private ListNode head;
    private ListNode tail;

    private static class ListNode {
        private int data;
        private ListNode next;
        private ListNode previous;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public DoublyLInkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public int length() {
        ListNode temp = head;
        int cnt = 0;
        while (temp != null) {
            cnt++;
            temp = temp.next;
        }
        return cnt;
    }

    public void insertAtStart(int data) {
        ListNode newNode = new ListNode(data);
        if (length() == 0) {
            tail = newNode;
        }
        newNode.next = head;
        newNode.previous = null;
        head = newNode;
    }

    public void insertAtEnd(int data) {
        ListNode newNode = new ListNode(data);
        if (length() == 0) {
            head = newNode;
        } else {
            newNode.previous = tail;
            tail.next = newNode;
            newNode.next = null;
        }
        tail = newNode;
    }

    public ListNode deleteFirstNode(ListNode head) {
        if (length() == 0) {
            return null;
        }
        if (head == tail) {
            tail = null;
        } else {
            head.next.previous = null;
        }
        head = head.next;
        return head;
    }

    public ListNode deleteLastNode(ListNode head) {
        if (length() == 0) {
            return null;
        }
        if (head == tail) {
            tail = null;
            head = null;
        } else {
            tail = tail.previous;
            tail.next = null;
        }
        return head;

    }

    public void printDoublyLinkedList(ListNode head) {
        if (length() == 0) {
            return;
        }
        ListNode temp = head;
        while (temp.next != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print(temp.data + "->");
        System.out.println(temp.next);
        System.out.println("head is at = " + head.data);
        System.out.println("tail is at = " + tail.data);
    }

    public static void main(String[] args) {
        DoublyLInkedList obj = new DoublyLInkedList();
        obj.insertAtStart(3);
        obj.insertAtStart(4);
        obj.insertAtEnd(6);
        obj.printDoublyLinkedList(obj.head);
        obj.head = obj.deleteFirstNode(obj.head);
        obj.head = obj.deleteLastNode(obj.head);
        obj.printDoublyLinkedList(obj.head);
        System.out.println("linked list length = " + obj.length());
    }
}