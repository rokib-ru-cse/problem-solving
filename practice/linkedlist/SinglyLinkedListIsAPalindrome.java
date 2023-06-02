package practice.linkedlist;

import linkedList.ListNode;
import tree.TreeNode;

import javax.sound.midi.Track;


public class SinglyLinkedListIsAPalindrome {

    ListNode head;

    public static void main(String[] args) {
        SinglyLinkedListIsAPalindrome list = new SinglyLinkedListIsAPalindrome();

        list.head = new ListNode(1);
        list.head.next = new ListNode(2);
        list.head.next.next = new ListNode(3);
        list.head.next.next.next = new ListNode(2);
        list.head.next.next.next.next = new ListNode(1);

        System.out.println(isPalindrome(list.head));

    }

    private static boolean isPalindrome(ListNode head) {
        ListNode newList = null;
        ListNode temp = head;
        while (temp != null) {
            ListNode nextNode = temp.next;
            temp.next = newList;
            newList = temp;
            temp = nextNode;
        }
//        temp = newList;
        ListNode head1 = head;
        ListNode head2 = newList;
        while (head1 != null && head2 != null) {
            if (head1.data != head2.data) {
                return false;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return true;
    }
}
