package linkedList;

public class LinkedListInsertion {

    public static Node insertAtStart(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }

    public static Node insertAtMiddle(Node head, int data) {
        Node newNode = new Node(data);
        Node newHead = head;
        Node fast = head;
        Node slow = head;
        Node pre = head;
        while (fast!=null && fast.next!=null) {
            pre = slow;
            fast = fast.next.next;
            slow = slow.next;
        }
        newNode.next = pre.next;
        pre.next = newNode;
        return head;
    }

    public static Node insertAtEnd(Node head, int data) {
        Node newNode = new Node(data);
        Node newHead = head;
        while (newHead.next != null) {
            newHead = newHead.next;
        }
        newHead.next = newNode;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        Node n = insertAtStart(head, 10);
        while (n != null) {
            if (n.next == null) {
                System.out.print(n.value);

            } else {
                System.out.print(n.value + "->");
            }
            n = n.next;
        }
        System.out.println();

        n = insertAtEnd(head, 100);
        while (n != null) {
            if (n.next == null) {
                System.out.print(n.value);

            } else {
                System.out.print(n.value + "->");
            }
            n = n.next;
        }
        System.out.println();

        n = insertAtMiddle(head, 50);
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
