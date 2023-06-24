public class CircularSinglyLinkedList {
    private ListNode last;

    private static class ListNode{
        int data;
        ListNode next;
        public ListNode(int data){
            this.data = data;
        }
    }

    public CircularSinglyLinkedList(){
        this.last = null;
    }
    public void insertAtStart(int data){
        ListNode newNode = new ListNode(data);
        if(last==null){
            newNode.next = last;
            last = newNode;
        }else{
            newNode.next = last;
            last.next =newNode;
        }
    }
    public void printCircularList(ListNode head){
        if(last==null){
            return;
        }
        
        ListNode first = last.next;
        while(first!=last){
            System.out.print(first.data+"->");
            first = first.next;
        }
        System.out.println(first.data);
    }
    public static void main(String[] args) {
        CircularSinglyLinkedList obj = new CircularSinglyLinkedList();
        obj.insertAtStart(4);
        obj.insertAtStart(6);
        obj.printCircularList(obj.last);
        obj.insertAtStart(5);
        obj.printCircularList(obj.last);

    }
}
