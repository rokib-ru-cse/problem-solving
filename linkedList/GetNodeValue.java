package linkedList;

public class GetNodeValue {

    public static int getNode(Node llist, int positionFromTail) {
        // Write your code here
        if (llist == null) {
            return 0;
        }
        int length = 0;
        Node temp = llist;
        while (temp != null) {
            temp = temp.next;
            length++;
        }
        int expectedIndex = length - positionFromTail - 1;
        int cnt = 0;
        temp = llist;
        while (temp != null && cnt != expectedIndex) {
            temp = temp.next;
            cnt++;
        }
        return temp.value;
    }

    public static void main(String[] args) {

    }
}
