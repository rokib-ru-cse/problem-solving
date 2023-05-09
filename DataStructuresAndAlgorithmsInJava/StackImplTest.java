package DataStructuresAndAlgorithmsInJava;

public class StackImplTest{

ListNodeTest front;
ListNodeTest tail;
int size=0;

    public static void main(String[] args) {
        StackImplTest stack = new StackImplTest();
        stack.add(100);
        stack.add(100);
        stack.add(100);
        stack.add(100);
    }

    void add(int data){
        size++;
        if(front==null){
            front = new ListNodeTest(data);
            tail = front;
            return;
        }
        ListNodeTest newNode = new ListNodeTest(data);
        tail.next = newNode;
        tail = tail.next;
    }

}