package DSImplementation;


public class StackImpl {

    int data;
    StackImpl next;

    StackImpl() {

    }

    StackImpl(int data) {
        this.data = data;
        this.next = null;
        //lastPointer++;
    }

    StackImpl(int data, StackImpl nextNode) {
        this.data = data;
        this.next = nextNode;
        //lastPointer++;
    }

    public void add(int data){
        StackImpl newNode = new StackImpl(data);
        if(head==null){
            head = newNode;
            return;
        }
        StackImpl tempHead = head;
        while (tempHead.next!=null){
            tempHead = tempHead.next;
        }
        tempHead.next = newNode;
    }

    public StackImpl peek(){
        if(head==null){
            return null;
        }
        StackImpl tempHead = head;
        while (tempHead.next!=null){
            tempHead = tempHead.next;
        }
        return tempHead;
    }

    public StackImpl pop() {
        if (head==null){
            System.out.println("Stack is empty");
            return null;
        }
        StackImpl tempHead = head;
        if(tempHead.next==null){
            StackImpl lastNode = tempHead;
            head = null;
            return lastNode;
        }
        while (tempHead.next.next != null) {
            tempHead = tempHead.next;
        }
        StackImpl lastNode = tempHead.next;
        tempHead.next = null;
        return lastNode;
    }

    //public static int lastPointer = 0;
    public static StackImpl head = null;

    public static void printStack() {
        if(head==null){
            return;
        }
        StackImpl tempHead = head;
        while (tempHead != null) {
            if (tempHead.next != null) {
                System.out.print(tempHead.data + "->");
            } else {
                System.out.print(tempHead.data);
            }
            tempHead = tempHead.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackImpl root = new StackImpl(10);
        head = root;
        root.next = new StackImpl(5);
        root.next.next = new StackImpl(2);
        root.next.next.next = new StackImpl(1);
       // printStack();
        root.pop();
        //printStack();
        root.pop();
        //printStack();
        root.pop();
        //printStack();
        root.pop();
        root.add(5);
        root.add(10);
        StackImpl pek1 = root.peek();
        System.out.println(pek1.data);
        System.out.println(pek1.next);
        printStack();
    }
}
