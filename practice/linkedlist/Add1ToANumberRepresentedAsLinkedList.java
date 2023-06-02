package practice.linkedlist;

import linkedList.ListNode;

import java.util.Currency;

public class Add1ToANumberRepresentedAsLinkedList {
    ListNode head;

    public static void main(String[] args) {
        Add1ToANumberRepresentedAsLinkedList list = new Add1ToANumberRepresentedAsLinkedList();
        list.head = new ListNode(1);
        list.head.next = new ListNode(2);
        list.head.next.next = new ListNode(3);
        list.head.next.next.next = new ListNode(4);

        list.print(list.head);
        list.head = list.addoneByReverseList(list.head);
        System.out.println();
        list.print(list.head);

    }

    private ListNode addoneByReverseList(ListNode head) {

        ListNode current = head;
        ListNode previous = null;
        while (current != null) {
            ListNode temp1 = current.next;
            current.next = previous;
            previous = current;
            current = temp1;
        }
        ListNode temp = previous;

        int sum = 1;

        ListNode previousOfTemp = null;
        while (temp != null) {
            sum = sum + temp.data;
            if (sum > 9) {
                temp.data = sum % 10;
                sum = sum / 10;
            } else {
                temp.data = sum;
            }
            previousOfTemp = temp;
            temp = temp.next;
        }
        if (sum > 0) {
            previousOfTemp.next = new ListNode(sum);
            previousOfTemp = previousOfTemp.next;
        }

        current = previousOfTemp;
        previous = null;
        while (current != null) {
            ListNode temp1 = current.next;
            current.next = previous;
            previous = current;
            current = temp1;
        }

        return previous;
    }

    private ListNode addone(ListNode head) {
        return null;
    }

    private void print(ListNode head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data + " ");
        print(head.next);
    }
}
