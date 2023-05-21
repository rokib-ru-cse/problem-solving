package linkedList;

import java.util.NoSuchElementException;

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
        dList.printList();
        dList.printListReverse();
    }

    public void addLast(T data) {
        size++;
        Node<T> node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }else{
            tail.next = node;
            node.previous = tail;
            tail = node;
        }
    }

    public void addFirst(T data) {
        size++;
        Node<T> node = new Node<>(data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            head.previous = node;
            node.next = head;
            head = node;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        size--;
        T data = (T) tail.data;
        if (head == tail) {
            head = null;
            tail = null;
        }else{
            tail = tail.previous;
            tail.next = null;
        }
        return data;
    }

    public T removeFirst() {
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        size--;
        T data = (T)head.data;
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
        }
        return data;
    }

    public void printList() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public void printListReverse(){
        Node<T> current = tail;
        while (current!=null){
            System.out.print(current.data+" ");
            current =current.previous;
        }
        System.out.println();
    }


}
