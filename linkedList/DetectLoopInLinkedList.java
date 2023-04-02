package linkedList;

public class DetectLoopInLinkedList {

    static boolean detectLoopInLinkedList(Node root) {
        Node slow = root;
        Node fast = root;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
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
        System.out.println(detectLoopInLinkedList(one));

    }
}
