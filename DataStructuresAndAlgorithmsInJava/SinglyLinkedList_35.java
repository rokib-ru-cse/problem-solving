package DataStructuresAndAlgorithmsInJava;

public class SinglyLinkedList_35 {

    SinglyLinkNode head;


    public static void main(String[] args) {
        SinglyLinkedList_35 head = new SinglyLinkedList_35();
        head.add(10);
        head.add(5);
        head.add(15);
        head.add(20);
        head.add(0);
        head.add(100);
        head.add(200);
        head.add(300);
        head.print();
    }

    private void print() {
        SinglyLinkNode temp = head;
        while (temp != null) {
            if (temp.next == null) {
                System.out.print(temp.data);
            } else {
                System.out.print(temp.data + "->");
            }
            temp = temp.next;
        }
    }

    private void add(int data) {
        if (head == null) {
            head = new SinglyLinkNode(data);
            return;
        }
        SinglyLinkNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new SinglyLinkNode(data);
    }

}
