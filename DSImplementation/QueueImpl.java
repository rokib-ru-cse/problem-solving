package DSImplementation;

public class QueueImpl {
    private ListNode front;
    private ListNode rear;
    private int size = 0;
    class ListNode {
        private int data;
        private ListNode next;

        public ListNode() {

        }

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

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
