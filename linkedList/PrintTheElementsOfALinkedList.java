package linkedList;

public class PrintTheElementsOfALinkedList {

    static void printLinkedList(Node head) {
        Node temp = head;
        while (temp!=null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {

    }
}
