package linkedList;

import DataStructuresAndAlgorithmsInJava.SinglyLinkNode;

public class SinglyLinkedListIsAPalindromeTest {
    SinglyLinkNode head;

    static boolean singlyLinkedListIsAPalindrome(SinglyLinkNode root) {
        SinglyLinkedListIsAPalindromeTest x = new SinglyLinkedListIsAPalindromeTest();
        x.print();
        
        SinglyLinkNode newList = null;
        SinglyLinkNode temp = root;
        while (temp!=null){
            SinglyLinkNode tempNode = temp;
            tempNode.setNext(newList);
            newList = tempNode;
            temp = temp.getNext();
        }

        return false;
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
            head = new SinglyLinkNode(data);
            return;
        }
        SinglyLinkNode temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(new SinglyLinkNode(data));
    }

    public static void main(String[] args) {
        SinglyLinkedListIsAPalindromeTest head = new SinglyLinkedListIsAPalindromeTest();
        head.add(1);
        head.add(2);
        head.add(1);
        head.print();
        System.out.println(singlyLinkedListIsAPalindrome(head.head));
    }
}
