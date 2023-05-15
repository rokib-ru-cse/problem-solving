package linkedList;

public class CycleDetection {

    static boolean hasCycle(Node head) {
        Node slow=head;
        Node fast=head;
        while (slow!=null && fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow==fast){
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {

    }
}
