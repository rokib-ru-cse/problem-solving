/**
 * SinglyLinkedList
 */
public class SinglyLinkedList {

    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void printLinkedList(ListNode head) {
        ListNode temp = head;
        while (temp.next != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print(temp.data+"->");
        System.out.println(temp.next);
        // System.out.println(temp.data);
    }

    public int length(ListNode head) {
        ListNode temp = head;
        int cnt = 0;
        while (temp != null) {
            cnt++;
            temp = temp.next;
        }
        return cnt;
    }

    public void insertAtStart(int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void insertAtPosition(int position, int data) {
        ListNode newNode = new ListNode(data);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        int cnt = 1;
        ListNode temp = head;
        while (cnt < position - 1) {
            temp = temp.next;
            cnt++;
            if (cnt > length(head)) {
                System.out.println("invalid position");
                return;
            }
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void deleteFirstNode() {
        if (length(head) > 0) {
            head = head.next;
        }
    }

    public void deleteLastNode() {
        if (length(head) > 0) {
            ListNode temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    public void deleteNodeAtPosition(int position) {
        if (position == 1) {
            head = head.next;
            return;
        }
        ListNode temp = head;
        int cnt = 1;
        while (cnt < position - 1) {
            temp = temp.next;
            cnt++;
        }
        temp.next = temp.next.next;
    }
    public void deleteNode(int data){
        ListNode temp = null;
        ListNode current = head;
        while(current!=null&&current.data!=data){
            temp = current;
            current = current.next;
        }
        if(current==null) return;
        temp.next = current.next;
    }

    public boolean searchNode(int value) {
        ListNode temp = head;
        while (temp != null) {
            if (temp.data == value) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public void reverseLinkedList() {
        ListNode previous = null;
        ListNode current = head;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }

    public int findMiddleNode() {
        if (length(head) == 1) {
            return head.data;
        }
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr.data;
    }

    public int getNthNodeFromEnd(int value) {
        if (value > length(head)) {
            return 0;
        }
        ListNode temp = head;
        int cnt1 = length(head) - value;
        int cnt2 = 0;
        while (cnt2 < cnt1) {
            temp = temp.next;
            cnt2++;
        }
        return temp.data;
    }

    public void BubbleSortLinkedList() {
        if (length(head) > 1) {
            for (int i = 0; i < length(head); i++) {
                ListNode current = head;
                ListNode next = head.next;
                for (int j = 0; j < length(head) - 1; j++) {
                    if (current.data > next.data) {
                        int temp = current.data;
                        current.data = next.data;
                        next.data = temp;
                    }
                    current = next;
                    next = next.next;
                }
            }
        }
    }

    public void removeDuplicateElement() {
        ListNode temp = head;
        while (temp.next != null) {
            if (temp.data == temp.next.data) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
    }

    public ListNode insertAtSortedList(ListNode head, int data) {
        
        ListNode current = head;
        ListNode temp = null;
        ListNode newNode = new ListNode(data);
        if(head.data>newNode.data){
            newNode.next = head;
            head = newNode;
            return head;
        }
        while (current!=null&&current.data < newNode.data) {
            temp = current;
            current = current.next;
        }
        newNode.next = current;
        temp.next = newNode;
        return head;
    }
    public void createLoop(){
        ListNode temp1 = head;
        ListNode temp2 = head;
        int cnt=1;
        while(cnt<length(head)/2){
            temp1 = temp1.next;
            cnt++;
        }
        while(temp2.next!=null){
            temp2 = temp2.next;
        }
        temp2.next = temp1;
    }
    public boolean detectLoopInLinkedList(){
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while(fastPtr!=null&&fastPtr.next!=null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if(slowPtr == fastPtr){
                return true;
            }
        }
        return false;
    }
    public int getStartingNodeOfLoop(ListNode match){
        ListNode slowPtr = head;
        while(slowPtr.data!=match.data){
            slowPtr = slowPtr.next;
            match = match.next;
        }
        return slowPtr.data;
    }
    public int findStartNodeOfLoop(){
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while(fastPtr!=null&&fastPtr.next!=null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if(slowPtr.data == fastPtr.data){
                return getStartingNodeOfLoop(slowPtr);
            }
        }
        return 0;
    }
    public void removeLoop(ListNode match){
        ListNode slowPtr = head;
        while(slowPtr.next.data!=match.next.data){
            slowPtr = slowPtr.next;
            match = match.next;
        }
        match.next = null;
    }
    public void removeLoopFromLinkedList(){
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while(fastPtr!=null&&fastPtr.next!=null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if(slowPtr == fastPtr){
                removeLoop(slowPtr);
            }
        }
    }
    public ListNode mergeTwoSortedLinkedList(ListNode list1,ListNode list2){
        ListNode d = new ListNode(0);
        ListNode merge = d;
        while(list1!=null&&list2!=null){
            if(list1.data<=list2.data){
                merge.next = list1;
                list1 = list1.next;
            }else{
                merge.next = list2;
                list2 = list2.next;
            }
            merge = merge.next;
        }
        if(list1==null){
            merge.next = list2;
        }else{
            merge.next = list1;
        }
        return d.next;
    }
    public static void main(String[] args) {
        SinglyLinkedList obj = new SinglyLinkedList();
        obj.head = new ListNode(20);
        ListNode second = new ListNode(10);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(100);
        obj.head.next = second;
        second.next = third;
        third.next = fourth;
        obj.insertAtStart(3);
        obj.insertAtEnd(5);
        obj.insertAtEnd(55);
        obj.insertAtEnd(11);
        obj.insertAtPosition(2, 11);
        obj.insertAtPosition(3, 11);
        obj.insertAtPosition(3, 11);
        obj.insertAtPosition(8, 33);
        obj.printLinkedList(obj.head);
        obj.deleteFirstNode();
        obj.deleteLastNode();
        obj.printLinkedList(obj.head);
        obj.deleteNodeAtPosition(6);
        obj.printLinkedList(obj.head);
        obj.reverseLinkedList();
        obj.printLinkedList(obj.head);
        System.out.println("middle element = " + obj.findMiddleNode());
        System.out.println("second element form end = " + obj.getNthNodeFromEnd(2));
        System.out.println("search node 30 = " + obj.searchNode(30));
        System.out.println("search node 34 = " + obj.searchNode(34));
        System.out.print("sort linked list = ");
        obj.BubbleSortLinkedList();
        obj.printLinkedList(obj.head);
        obj.removeDuplicateElement();
        System.out.print("after removing duplicate element = ");
        obj.printLinkedList(obj.head);
        obj.head = obj.insertAtSortedList(obj.head,12);
        obj.head = obj.insertAtSortedList(obj.head,4);
        obj.head = obj.insertAtSortedList(obj.head,1);
        obj.head = obj.insertAtSortedList(obj.head,120);
        obj.printLinkedList(obj.head);
        obj.deleteNode(10);
        System.out.print("after deleting node 10 = ");
        obj.printLinkedList(obj.head);
        System.out.println("linkedlist length = " + obj.length(obj.head));
        System.out.println("Before creating loop");
        if(obj.detectLoopInLinkedList()){
            System.out.println("Loop exist in this linked list");
        }else{
            System.out.println("There is no Loop in this linked list");
        }
        obj.createLoop();
        System.out.println("After creating loop");
        if(obj.detectLoopInLinkedList()){
            System.out.println("Loop exist in this linked list");
        }else{
            System.out.println("There is no Loop in this linked list");
        }
        System.out.println("loop is start from node = "+obj.findStartNodeOfLoop());
        obj.removeLoopFromLinkedList();
        System.out.println("After removing loop from linked list");
        if(obj.detectLoopInLinkedList()){
            System.out.println("Loop exist in this linked list");
        }else{
            System.out.println("There is no Loop in this linked list");
        }
        obj.printLinkedList(obj.head);
        System.out.println("Merge two sorted linked list ");
        ListNode list1 = new ListNode(4);
        list1 = obj.insertAtSortedList(list1,5);
        list1 = obj.insertAtSortedList(list1,20);
        list1 = obj.insertAtSortedList(list1,6);
        list1 = obj.insertAtSortedList(list1,15);
        list1 = obj.insertAtSortedList(list1,7);
        obj.printLinkedList(list1);
        ListNode list2 = new ListNode(1);
        list2 = obj.insertAtSortedList(list2,2);
        list2 = obj.insertAtSortedList(list2,9);
        list2 = obj.insertAtSortedList(list2,10);
        list2 = obj.insertAtSortedList(list2,3);
        list2 = obj.insertAtSortedList(list2,11);
        list2 = obj.insertAtSortedList(list2,14);
        obj.printLinkedList(list2);
        ListNode mergedList = obj.mergeTwoSortedLinkedList(list1, list2);
        System.out.println("after merging two sorted linked list ");
        obj.printLinkedList(mergedList);
    }
}