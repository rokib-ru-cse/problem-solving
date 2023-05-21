package queue;

import linkedList.ListNode;

public class QueueImpl {
    private ListNode front;
    private ListNode rear;
    private int size = 0;

    public int getSize() {
        return size;
    }
    public boolean isEmpty(){
        return false;
    }

    public static void main(String[] args) {
        QueueImpl q1 = new QueueImpl();
    }


}
