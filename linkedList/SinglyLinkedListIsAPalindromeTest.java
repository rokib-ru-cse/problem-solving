package linkedList;

public class SinglyLinkedListIsAPalindromeTest {
    SinglyLinkNode head;

    static boolean singlyLinkedListIsAPalindrome(SinglyLinkNode root) {

        SinglyLinkNode newList = null;
        SinglyLinkNode temp = root;
        while (temp!=null){
            SinglyLinkNode tempNode = new SinglyLinkNode(temp.data);
            tempNode.setNext(newList);
            newList = tempNode;
            temp = temp.getNext();
        }
       SinglyLinkNode temp1 = newList;
       SinglyLinkNode temp2 = root;
        while (temp1 != null && temp2!=null) {
            if (temp1.data!=temp2.data){
                return false;
            }
            temp1 = temp1.getNext();
            temp2 = temp2.getNext();
        }
        return true;
    }

    private void print() {
        SinglyLinkNode temp = head;
        while (temp != null) {
            if (temp.getNext() == null) {
                System.out.print(temp.data);
            } else {
                System.out.print(temp.data + "->");
            }
            temp = temp.getNext();
        }
        System.out.println();
    }

    private void add(int data) {
        if (head == null) {
            head = new SinglyLinkNode(data);
            return;
        }
        SinglyLinkNode temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(new SinglyLinkNode(data));
    }

    public static void main(String[] args) {
        SinglyLinkedListIsAPalindromeTest head = new SinglyLinkedListIsAPalindromeTest();
        head.add(1);
        head.add(2);
        head.add(3);
        head.add(2);
        head.add(1);
        head.print();
        System.out.println(singlyLinkedListIsAPalindrome(head.head));
    }
}
