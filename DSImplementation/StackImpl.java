package DSImplementation;


public class StackImpl {

    int data;
    StackImpl next;
    int size;

    StackImpl() {

    }

    StackImpl(int data) {
        this.data = data;
        this.next = null;
        size++;
    }

    StackImpl(int data, StackImpl nextNode) {
        this.data = data;
        this.next = nextNode;
        size++;
    }

    public void add(int data) {
        this.size++;
        StackImpl newNode = new StackImpl(data);
        if (head == null) {
            head = newNode;
            return;
        }
        StackImpl tempHead = head;
        while (tempHead.next != null) {
            tempHead = tempHead.next;
        }
        tempHead.next = newNode;
    }

    public StackImpl peek() {
        if (head == null) {
            return null;
        }
        StackImpl tempHead = head;
        while (tempHead.next != null) {
            tempHead = tempHead.next;
        }
        return tempHead;
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    public StackImpl pop() {
        size--;
        if (head == null) {
            System.out.println("Stack is empty");
            return null;
        }
        StackImpl tempHead = head;
        if (tempHead.next == null) {
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

    public int size(){
        return this.size;
    }
    public static StackImpl head = null;

    public static void printStack() {
        if (head == null) {
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
        StackImpl root = new StackImpl();
        head = root.next;
        root.add(10);
        root.add(5);
        root.add(2);
        root.add(1);
        System.out.println(root.size());
        printStack();
        root.pop();
        printStack();
        root.pop();
        printStack();
        root.pop();
        printStack();
        root.pop();

        System.out.println(root.isEmpty());
        root.add(5);
        root.add(10);
        StackImpl pek1 = root.peek();
        System.out.println(pek1.data);
        System.out.println(pek1.next);
        System.out.println(root.isEmpty());
        printStack();
    }
}
