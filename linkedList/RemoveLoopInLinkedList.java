package linkedList;

public class RemoveLoopInLinkedList {

    static Node removeLoopInLinkedList(Node root) {

        Node slow = root;
        Node fast = root;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                slow.next = null;
                break;
            }
        }

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
        Node n = removeLoopInLinkedList(one);
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
