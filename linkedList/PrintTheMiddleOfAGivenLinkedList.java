package linkedList;



public class PrintTheMiddleOfAGivenLinkedList {

    static int printTheMiddleOfAGivenLinkedList(Node root){

        Node fast=root;
        Node slow=root;

        while (fast!=null && fast.next !=null){
            fast=fast.next.next;
            slow=slow.next;
        }

        return  slow.value;
    }

    public static void main(String[] args) {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);


        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        System.out.println(printTheMiddleOfAGivenLinkedList(one));

    }
}
