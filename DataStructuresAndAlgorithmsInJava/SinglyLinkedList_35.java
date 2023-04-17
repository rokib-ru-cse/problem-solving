package DataStructuresAndAlgorithmsInJava;

public class SinglyLinkedList_35 {

    SinglyLinkNode<Integer> head;

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
        head.remove(200);
        head.print();
        head.reverse();
        head.print();
    }

    private void reverse() {
        SinglyLinkNode current = head;
        SinglyLinkNode previous = null;
        while (current!=null){
            SinglyLinkNode temp = current;
            current = current.next;
            temp.next = previous;
            previous = temp;
        }
        head = previous;
    }

    private void remove(int data) {
        SinglyLinkNode temp = head;
        while (temp.next!=null){
            if((int)temp.next.data==data){
                temp.next = temp.next.next;
                return;
            }
            temp=temp.next;
        }
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
        System.out.println();
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
