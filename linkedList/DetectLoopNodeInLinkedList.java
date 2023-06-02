package linkedList;

public class DetectLoopNodeInLinkedList {

    public static void main(String[] args) {

        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(4);
        Node four = new Node(6);

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = two;
        System.out.println(detectLoopNodeInLinkedList(one));

    }

    private static int detectLoopNodeInLinkedList(Node one) {
        Node meet = detectCycle(one);
        Node start = one;
        while (start != meet) {
            start = start.next;
            meet = meet.next;
        }
        return start.value;
    }

    private static Node detectCycle(Node one) {
        Node slow = one;
        Node fast = one;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return slow;
            }
        }
        return null;
    }
}
