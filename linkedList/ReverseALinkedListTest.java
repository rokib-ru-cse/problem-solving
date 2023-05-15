package linkedList;

public class ReverseALinkedListTest {

    public static Node reverse(Node llist) {
        // Write your code here
        Node current=llist;
        Node previous=null;
        while (current!=null){
            Node temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }
        return previous;
    }

    public static void main(String[] args) {

    }
}
