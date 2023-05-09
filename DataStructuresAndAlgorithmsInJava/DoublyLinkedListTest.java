package DataStructuresAndAlgorithmsInJava;

public class DoublyLinkedListTest<T> {

    Node head;
    Node tail;
    int size;

    private static class Node<T> {
        T data;
        Node next;
        Node previous;

        Node() {
        }

        Node(T data) {
            this.data = data;
            next = null;
            previous = null;
        }
    }

    DoublyLinkedListTest() {
        size = 0;
        head = null;
        tail = null;
    }


    public static void main(String[] args) {
        DoublyLinkedListTest<String> dList = new DoublyLinkedListTest<>();
        dList.addLast("how");
        dList.addFirst("hi");
    }

    public void addLast(T data) {
        size++;
        Node<T> node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.previous = tail;
        tail = tail.next;
    }
    public void addFirst(T data){
        size++;
        Node<T> node = new Node<>(data);
        if(head==null){
            head = node;
            tail=node;
        }else{
            node.next = head;
            head = node;
        }
    }



}
