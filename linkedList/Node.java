package linkedList;

public class Node {
        int value;
        linkedList.Node next;

        public Node(){}
        public Node(int data){
            this.value = data;
            this.next = null;
        }
       public Node(int data, linkedList.Node next){
            this.value = data;
            this.next = next;
        }
}
