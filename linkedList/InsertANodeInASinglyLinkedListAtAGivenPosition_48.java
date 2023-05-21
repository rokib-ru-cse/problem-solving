package linkedList;

public class InsertANodeInASinglyLinkedListAtAGivenPosition_48 {
    SinglyLinkNode head;

    public static void main(String[] args) {
        InsertANodeInASinglyLinkedListAtAGivenPosition_48 head = new InsertANodeInASinglyLinkedListAtAGivenPosition_48();
        head.add(200);
        head.add(20);
        head.add(10);
        head.add(5);
        head.add(100);
        head.print();
        head.add(3,50);
        head.print();


    }

    private void add(int position, int data) {
        SinglyLinkNode temp = head;
        int counter = 1;
        while (temp!=null&&counter!=position){
            temp = temp.next;
            counter++;
        }
        SinglyLinkNode newNode = new SinglyLinkNode(data);
        SinglyLinkNode nextAddress = temp.next;
        temp.next = newNode;
        newNode.next = nextAddress;
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
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(new SinglyLinkNode(data));
    }
}
