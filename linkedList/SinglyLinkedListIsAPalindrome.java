package linkedList;

public class SinglyLinkedListIsAPalindrome {
    static boolean singlyLinkedListIsAPalindrome(Node root){

        return false;
    }

    public static void main(String[] args) {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(2);
        Node four = new Node(1);

        one.next = two;
        two.next = three;
        three.next = four;
        System.out.println(singlyLinkedListIsAPalindrome(one));
    }
}
