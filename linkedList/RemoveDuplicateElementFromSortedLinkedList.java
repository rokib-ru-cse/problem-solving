package linkedList;

public class RemoveDuplicateElementFromSortedLinkedList {

static Node removeDuplicateElementFromSortedLinkedList(Node node){
    Node newRoot = node;

    return  null;
}
    public static void main(String[] args) {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node three1 = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);

        one.next = two;
        two.next = three;
        three.next = three1;
        three1.next = four;
        four.next = five;

        Node n = removeDuplicateElementFromSortedLinkedList(one) ;
        while (n!=null){
            System.out.print(n.value+"->");
            n=n.next;
        }
    }
}
