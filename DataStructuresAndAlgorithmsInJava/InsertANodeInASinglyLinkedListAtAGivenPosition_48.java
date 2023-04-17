package DataStructuresAndAlgorithmsInJava;

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

    }

    private void print() {

    }

    private void add(int data) {
        if(head==null){
            head = new SinglyLinkNode(data);
            return;
        }
        SinglyLinkNode temp = head;
        while (temp.getNext()!=null){
                temp = temp.getNext();
        }
        temp = new SinglyLinkNode(data);
    }
}
