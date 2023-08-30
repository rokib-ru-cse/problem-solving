package linkedList;

public class
ReverseALinkedListTest {

    Node head;

    public ReverseALinkedListTest(int data) {
        head = new Node(data);
    }

    public static Node reverseLinkedListIterative(Node head) {
        Node current = head;
        Node previous = null;
        while (current != null) {
            Node temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }
        return previous;
    }

    public static void main(String[] args) {
        ReverseALinkedListTest list1 = new ReverseALinkedListTest(2);
        list1.head.next = new Node(3);
        list1.head.next.next = new Node(4);
        list1.head.next.next.next = new Node(5);

        ReverseALinkedListTest list2 = new ReverseALinkedListTest(2);
        list2.head.next = new Node(3);
        list2.head.next.next = new Node(4);
        list2.head.next.next.next = new Node(5);

        list1.head = reverseLinkedListIterative(list1.head);
        list2.head = reverseLinkedListRecursive(list2.head, null);
        print(list1.head);
        print(list2.head);
    }

    static void print(Node head) {
        while (head != null) {
            System.out.print(head.value + " ");
            head = head.next;
        }
        System.out.println();
    }

    private static Node reverseLinkedListRecursive(Node head, Node current) {
        if (head.next == null) {
            return head;
        }

        Node newhead = reverseLinkedListRecursive(head.next,current);
        Node nextHead = head.next;
        nextHead.next = head;
        head.next = null;
        return newhead;
    }
}
