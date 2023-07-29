package linkedList;

public class FindNthNodeFromTheEndOfLinkedList {

    static Node findNthNodeFromTheEndOfLinkedList(Node root, int nth) {
        int total = 0;
        Node temp = root;
//        System.out.println("total" + total);
        while (temp != null) {
            total++;
            temp = temp.next;
        }
        int nthFromStart = total - nth + 1;
        total = 0;
        temp = root;
//        System.out.println("total" + total);
//        System.out.println("nthFromStart" + nthFromStart);
        while (temp != null) {
            total++;
            if (total == nthFromStart) {
                return temp;
            }
            temp = temp.next;
        }

        return null;
    }

    static Node findNthNodeFromLast1(Node head, int n) {
        int length = 0;
        Node temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        int positionFromStart = length - n;
        temp = head;
        for (int i = 0; i < positionFromStart; i++) {
            temp = temp.next;
        }
        return temp;
    }

    static Node findNthNodeFromLast2(Node head, int n) {
        Node firstPointer = head;
        Node secondPointer = head;
        for (int i = 0; i < n; i++) {
            firstPointer = firstPointer.next;
        }
        while (firstPointer != null) {
            firstPointer = firstPointer.next;
            secondPointer = secondPointer.next;
        }
        return secondPointer;
    }

    public static void main(String[] args) {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(4);
        Node four = new Node(6);
        Node five = new Node(7);

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        System.out.println(findNthNodeFromTheEndOfLinkedList(one, 2).value);
        System.out.println(findNthNodeFromLast1(one, 2).value);
        System.out.println(findNthNodeFromLast2(one, 2).value);
    }
}
