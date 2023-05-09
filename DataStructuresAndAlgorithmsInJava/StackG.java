package DataStructuresAndAlgorithmsInJava;

public class StackG<T> {
    ListNodeG<T> front;
    ListNodeG<T> tail;
    int size = 0;

    public static void main(String[] args) {
        StackG<String> stack = new StackG<>();
        stack.push("hi");
        stack.push("how");
        stack.push("are");
        stack.push("u");
        stack.print();
        System.out.println(stack.peek().data);

    }

    private ListNodeG<T> peek() {
        return tail;
    }

    private void print() {
        ListNodeG<T> temp = front;
        while (temp!=null){
            if(temp.next==null){
                System.out.print(temp.data);
            }else{
                System.out.print(temp.data+" ");
            }
            temp=temp.next;
        }
        System.out.println();
    }

    private void push(T data) {
        if (front == null) {
            front = new ListNodeG<>(data);
            tail = front;
            return;
        }
        ListNodeG<T> newNode = new ListNodeG<>(data);
        tail.next = newNode;
        tail = tail.next;
    }
}
