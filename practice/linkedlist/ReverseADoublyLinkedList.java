package practice.linkedlist;

import linkedList.DoublyLinkNode;

import java.util.NoSuchElementException;

public class ReverseADoublyLinkedList {

    DoublyLinkNode<Integer> head;
    DoublyLinkNode<Integer> tail;
    int size = 0;

    public static void main(String[] args) {
        ReverseADoublyLinkedList list = new ReverseADoublyLinkedList();
        list.head = list.insertAtFirst(list.head, 1);
        list.head = list.insertAtFirst(list.head, 2);
        list.head = list.insertAtFirst(list.head, 3);
        list.head = list.insertAtLast(list.head, 4);

//        System.out.println(list.removeAtFirst());
//        System.out.println(list.removeAtLast());
        list.print(list.head);
        list.head = list.reverse(list.head);
        System.out.println();
        list.print(list.head);
    }

    private DoublyLinkNode<Integer> reverse(DoublyLinkNode<Integer> head) {
        if (head == null || head == tail) {
            return head;
        }
        DoublyLinkNode currentNode = head;
        DoublyLinkNode previousNode = null;
        while (currentNode != null) {
            DoublyLinkNode temp = currentNode.next;
            currentNode.next = previousNode;
            currentNode.previous = temp;
            previousNode = currentNode;
            currentNode = temp;
        }
        return previousNode;
    }

    private int removeAtLast() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        size--;
        int data = tail.data;
        if (size == 0) {
            head = null;
            tail = null;
            return data;
        }

        tail = tail.previous;
        tail.next = null;
        return data;
    }

    private int removeAtFirst() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        size--;
        int data = head.data;
        if (size == 0) {
            head = null;
            tail = null;
            return data;
        }
        head = head.next;
        head.previous = null;
        return data;
    }

    private DoublyLinkNode<Integer> insertAtLast(DoublyLinkNode<Integer> head, int data) {
        size++;
        if (head == null) {
            head = new DoublyLinkNode<>(data);
            tail = head;
            return head;
        }
        DoublyLinkNode newNode = new DoublyLinkNode<>(data);
        tail.next = newNode;
        newNode.previous = tail;
        tail = newNode;
        return head;
    }

    private void print(DoublyLinkNode<Integer> head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data + " ");
        print(head.next);
    }

    private DoublyLinkNode insertAtFirst(DoublyLinkNode head, int data) {
        size++;
        if (head == null) {
            head = new DoublyLinkNode<>(data);
            tail = head;
            return head;
        }
        DoublyLinkNode newNode = new DoublyLinkNode(data);
        newNode.next = head;
        head.previous = newNode;
        return newNode;
    }
}
