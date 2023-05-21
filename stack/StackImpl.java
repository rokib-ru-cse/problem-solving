package stack;

import linkedList.ListNode;

import java.util.Stack;

public class StackImpl {

    ListNode head;
    ListNode tail;
    int size = 0;

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        StackImpl stack = new StackImpl();
        stack.push(10);
        stack.push(5);
        stack.push(100);
        stack.push(200);
        stack.push(300);
        stack.push(400);
        System.out.println("size is "+stack.size);
        stack.print();
        ListNode popedNode = stack.pop();
        if (popedNode != null) {
            System.out.println(popedNode.data);
        }
        stack.print();
        ListNode peekNode = stack.peek();
        if (peekNode != null) {
            System.out.println("peek " + peekNode.data);
        }
        System.out.println("size is "+stack.size);
    }

    private ListNode peek() {
        return tail;
    }

    private ListNode pop() {
        if (size > 0) {
            size--;
        }
        ListNode returnNode = null;
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            returnNode = head;
            head = null;
            tail = null;
            return returnNode;
        }
        ListNode temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        returnNode = temp.next;
        temp.next = null;
        tail = temp;
        return returnNode;
    }

    private void print() {
        ListNode temp = head;
        while (temp != null) {
            if (temp.next != null) {
                System.out.print(temp.data + "->");
            } else {
                System.out.print(temp.data);
            }
            temp = temp.next;
        }
        System.out.println();
    }

    private void push(int data) {
        size++;
        if (head == null) {
            head = new ListNode(data);
            tail = head;
            return;
        }
        ListNode newNode = new ListNode(data);
        tail.next = newNode;
        tail = tail.next;
    }
}
