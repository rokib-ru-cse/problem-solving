package linkedList;

public class PrintInReverse {

    public static void reversePrint(Node llist) {
        // Write your code here
        if (llist==null){
            return;
        }
        reversePrint(llist.next);
        System.out.println(llist.value);
    }
    public static void main(String[] args) {

    }
}
