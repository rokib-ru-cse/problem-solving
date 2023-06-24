import java.util.LinkedList;
import java.util.Queue;
public class QueueLinkedList {
    
    private ListNode front;
    private ListNode rear;
    private int length;

    public QueueLinkedList(){
        front = rear = null;
        length = 0;
    }

    private static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public boolean isEmpty(){
        return length==0;
    }

    public void enqueue(int data){
        ListNode newNode = new ListNode(data);
        if(isEmpty()){
            newNode.next = front;
            front = newNode;
        }else{
            rear.next = newNode;
        }
        rear = newNode;
        length++;
    }
    public int dequeue(){
        if(isEmpty()){
            return 0;
        }
        int temp = front.data;
        front = front.next;
        length--;
        if(front==null){
            rear = null;
        }
        return temp;
    }

    public void printQueue(){
        ListNode temp = front;
        while(temp!=rear){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    public static void main(String[] args) {
        QueueLinkedList obj = new QueueLinkedList();
        obj.enqueue(3);
        obj.enqueue(5);
        obj.enqueue(1);
        obj.printQueue();
        obj.dequeue();
        obj.printQueue();
        // generate binary numbers from 1 to 10 using queue
        Queue<String> q = new LinkedList<>();
        q.offer("1");
        String[] result = new String[10];
        for (int i = 0; i < 10 ; i++) {
            result[i] = q.poll();
            String s1 = result[i]+"0";
            String s2 = result[i]+"1";
            q.offer(s1);
            q.offer(s2);
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
        System.out.println();
        //! generate binary numbers from 1 to 10 using queue

    }
}
