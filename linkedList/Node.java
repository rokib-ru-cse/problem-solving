package linkedList;

public class Node {
        int value;
        linkedList.Node next;

        Node(){}
        Node(int data){
            this.value = data;
            this.next = null;
        }
        Node(int data, linkedList.Node next){
            this.value = data;
            this.next = next;
        }
}
