package practice.linkedlist;

import linkedList.ListNode;

public class ReverseALinkedList {

    ListNode head;

    public static void main(String[] args) {
        ReverseALinkedList list = new ReverseALinkedList();
        list.head = new ListNode(1);
        list.head.next = new ListNode(2);
        list.head.next.next = new ListNode(3);
        list.head.next.next.next = new ListNode(4);

        list.head = reverse(list.head);
        print(list.head);
    }

    private static void print(ListNode head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data + " ");
        print(head.next);
    }

    private static ListNode reverse(ListNode head) {

        ListNode current = head;
        ListNode previous = null;
        while (current != null) {
            ListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
}
