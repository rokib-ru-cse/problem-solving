package linkedList;

public class RemoveDuplicateElementFromSortedLinkedList {

    static Node removeDuplicateElementFromSortedLinkedList(Node node) {
        if (node == null) {
            return null;
        }
        Node newRoot = node;

        Node pre = node;
        node = node.next;
        while (node != null) {
            if (node.value == pre.value) {
                pre.next = node.next;
            } else {
                pre = node;
            }
            node = node.next;
        }

        return newRoot;
    }

    static Node removeDuplicateElementFromSortedLinkedList1(Node node) {
        if (node == null) {
            return null;
        }
        Node newRoot = node;

        while (node != null) {
            if (node.next != null && node.value == node.next.value) {
                node.next = node.next.next;
            }
            node = node.next;
        }

        return newRoot;
    }

    public static void main(String[] args) {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node three1 = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node five1 = new Node(5);

        one.next = two;
        two.next = three;
        three.next = three1;
        three1.next = four;
        four.next = five;
        five.next = five1;

        Node n = removeDuplicateElementFromSortedLinkedList(one);
        while (n != null) {
            System.out.print(n.value + "->");
            n = n.next;
        }
        System.out.println();
        n = removeDuplicateElementFromSortedLinkedList1(one);
        while (n != null) {
            System.out.print(n.value + "->");
            n = n.next;
        }
    }
}
