package linkedList;

public class Add1ToANumberRepresentedAsLinkedListTest {

    SinglyLinkNode head;

    public static SinglyLinkNode addExtraOne1(SinglyLinkNode<Integer> head) {
        SinglyLinkNode<Integer> temp = new SinglyLinkNode(0);
        temp.next = head;
        SinglyLinkNode<Integer> current = head;
        SinglyLinkNode<Integer> lastNonNineNode = temp;
        while (current != null) {
            if (current.data != 9) {
                lastNonNineNode = current;
            }
            current = current.next;
        }
        lastNonNineNode.data++;
        current = lastNonNineNode.next;
        while (current != null) {
            current.data = 0;
            current = current.next;
        }
        if (temp.data == 0) {
            return temp.next;
        } else {
            return temp;
        }
    }

    public static SinglyLinkNode addExtraOne2(SinglyLinkNode<Integer> head) {
        int carry = addExtraOneHelper(head);
        if (carry > 0) {
            SinglyLinkNode newNode = new SinglyLinkNode(carry);
            newNode.next = head;
            return newNode;
        }
        return head;
    }

    private static int addExtraOneHelper(SinglyLinkNode<Integer> head) {
        if (head == null) {
            return 1;
        }
        int carry = addExtraOneHelper(head.next);
        int sum = carry + head.data;
        head.data = sum % 10;
        return sum / 10;
    }


    public static SinglyLinkNode addExtraOne3(SinglyLinkNode<Integer> head) {
        
        return head;
    }

    public static void main(String[] args) {
        SinglyLinkNode<Integer> head1 = SinglyLinkedList.getSinglyLinkedList();
        print(head1);
        head1 = addExtraOne1(head1);
        print(head1);

        SinglyLinkNode<Integer> head2 = SinglyLinkedList.getSinglyLinkedList();
        print(head2);
        head2 = addExtraOne2(head2);
        print(head2);


    }


    private static void print(SinglyLinkNode head) {
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
}
