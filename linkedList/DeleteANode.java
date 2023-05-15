package linkedList;

public class DeleteANode {

    public static Node deleteNode(Node llist, int position) {
        // Write your code here
        if (position == 0) {
            return llist.next;
        }
        int cnt = 0;
        Node temp = llist;
        Node previous = null;
        while (temp != null && cnt != position) {
            previous = temp;
            temp = temp.next;
            cnt++;
        }
        if (temp != null) {
            previous.next = temp.next;
        } else {
            previous.next = temp;
        }
        return llist;
    }

    public static void main(String[] args) {

    }
}
