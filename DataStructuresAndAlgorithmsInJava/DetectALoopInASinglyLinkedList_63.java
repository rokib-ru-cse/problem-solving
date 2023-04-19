package DataStructuresAndAlgorithmsInJava;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class DetectALoopInASinglyLinkedList_63 {
    SinglyLinkNode head;

    public static void main(String[] args) {
        DetectALoopInASinglyLinkedList_63 x = new DetectALoopInASinglyLinkedList_63();
        DetectALoopInASinglyLinkedList_63 x1 = new DetectALoopInASinglyLinkedList_63();
        x.add(5);
        x.add(6);
        x.add(7);
        x.add(8);
        x.add(9);
        x.add(10);
        x.add(11);



        System.out.println("x "+x.head.hashCode());

        SinglyLinkNode slow = x.head;
        SinglyLinkNode fast = x.head;
        while (fast!=null && fast.next!=null){
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }
        fast.next = slow;
        x.print();
       // x1.print();
        if(x.isLoopExist(x.head)){
            System.out.println("loop exist");
            x.removeLoop();
        }else{
            System.out.println("loop doesnot exist");
        }
        if(x.isLoopExist(x.head)){
            System.out.println("loop exist");
            x.removeLoop();
        }else{
            System.out.println("loop doesnot exist");
            x.print();
        }
        
    }

    private void removeLoop() {
        Map<SinglyLinkNode,SinglyLinkNode> map = new LinkedHashMap<>();
        SinglyLinkNode fast = head;
        SinglyLinkNode slow = head;
        while (fast!=null && fast.getNext()!=null){
            if(!map.containsKey(slow)){
                map.put(slow,slow.getNext());
            }
            if(!map.containsKey(fast)){
                map.put(fast,fast.getNext());
            }
            slow = slow.getNext();
            fast = fast.getNext().getNext();
            if (slow==fast){
                break;
            }
        }

        for (Map.Entry<SinglyLinkNode,SinglyLinkNode> e:map.entrySet()) {
            for (Map.Entry<SinglyLinkNode,SinglyLinkNode> x:map.entrySet()) {
                if(e.getValue()==x.getValue() && e.getKey() !=x.getKey()){
                    x.getKey().setNext(null);
                    return;
                }
            }
        }
    }

    private boolean isLoopExist(SinglyLinkNode head) {
        SinglyLinkNode fast = head;
        SinglyLinkNode slow = head;
        while (fast!=null && fast.getNext()!=null){
            slow = slow.getNext();
            fast = fast.getNext().getNext();
            if (slow==fast){
                return true;
            }
        }
        return false;
    }

    private void print() {
        int cnt=0;
        SinglyLinkNode temp = head;

        System.out.println("temp "+temp.hashCode());
        System.out.println("head "+head.hashCode());

        while (temp != null && cnt!=7) {
            if (temp.next == null) {
                System.out.print(temp.data);
            } else {
                System.out.print(temp.data + "->");
            }
            temp = temp.next;
            cnt++;
        }
        System.out.println();
    }
    private void add(int data) {
        if (head == null) {
            head = new SinglyLinkNode(data);
            return;
        }
        SinglyLinkNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new SinglyLinkNode(data);
    }
}
