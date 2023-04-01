package linkedList;



public class DeleteMiddleOfLinkedList {

    static Node deleteMiddleOfLinkedList(Node root){

        Node fast=root;
        Node slow=root;
        Node newList = root;
        Node pre=null;
        while (fast!=null && fast.next!=null){
            pre = slow;
            fast=fast.next.next;
            slow = slow.next;


        }
        pre.next = slow.next;

        return  newList;
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

       Node n = deleteMiddleOfLinkedList(one) ;
       while (n!=null){
           System.out.print(n.value+"->");
           n=n.next;
       }
    }


}
