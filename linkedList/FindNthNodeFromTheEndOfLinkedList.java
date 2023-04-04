package linkedList;

public class FindNthNodeFromTheEndOfLinkedList {
    
    static Node findNthNodeFromTheEndOfLinkedList(Node root){


        return root;
    }

    public static void main(String[] args) {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(4);
        Node four = new Node(6);

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = two;
        Node n = findNthNodeFromTheEndOfLinkedList(one);
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
