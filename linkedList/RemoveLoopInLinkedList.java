package linkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class RemoveLoopInLinkedList {

    static Node removeLoopInLinkedList(Node root) {
        //return root;

        Node slow = root;
        Node fast = root;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return slow;
            }
        }

        return root;
    }

//    static void removeLoop(Node root) {
//        Node meet = removeLoopInLinkedList(root);
//        Node head = root;
//        while (true) {
//            Node temp = meet;
//            while (temp.next != meet && temp.next != head) {
//                temp = temp.next;
//            }
//            if (temp.next == head) {
//                temp.next = null;
//                return;
//            }
//            head = head.next;
//        }
//    }

    public static void main(String[] args) {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = one;
        removeLoop(one);
        Node n = one;
        while (n != null) {
            if (n.next == null) {
                System.out.print(n.value);
            } else {
                System.out.print(n.value + "->");
            }
            n = n.next;
        }
        // System.out.println('j'+'a'+'v'+'a');
    }

    public static void removeLoop(Node head) {
        Node meet = removeLoopInLinkedList(head);
        Node tempHead = head;
        while (true) {
            Node temp = meet;
            while (temp.next != meet && temp.next != tempHead) {
                temp = temp.next;
            }
            if (temp.next == tempHead) {
                temp.next = null;
                return;
            }
            tempHead = tempHead.next;
        }
    }


}
