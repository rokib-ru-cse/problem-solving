package linkedList;

import DataStructuresAndAlgorithmsInJava.SinglyLinkNode;

public class DeleteANodeFromLinkedListTest {
    SinglyLinkNode head;

    public static void main(String[] args) {
        DeleteANodeFromLinkedListTest head = new DeleteANodeFromLinkedListTest();
        head.add(10);
        head.add(5);
        head.add(7);
        head.add(8);
        head.add(100);
        head.print();
    }

    private void print() {
        SinglyLinkNode temp = head;
        while (temp != null) {
            if (temp.getNext() == null) {
                System.out.print(temp.getData());
            } else {
                System.out.print(temp.getData() + "->");
            }
            temp = temp.getNext();
        }
        System.out.println();
    }

    private void add(int data) {
        if (head == null) {
            head = new SinglyLinkNode<>(data);
            return;
        }
        SinglyLinkNode temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(new SinglyLinkNode<>(data));
    }
}
