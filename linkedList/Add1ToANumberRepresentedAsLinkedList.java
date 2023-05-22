package linkedList;

public class Add1ToANumberRepresentedAsLinkedList {

    SinglyLinkNode head;

    public static void main(String[] args) {
        Add1ToANumberRepresentedAsLinkedList head = new Add1ToANumberRepresentedAsLinkedList();
        head.add(9);
        head.add(9);
        head.add(9);
        head.add(9);
        head.print();
        head.addExtraOne();
        head.print();

    }

    private void addExtraOne() {
        int extra = backTrack(head);
        if (extra > 0) {
            SinglyLinkNode newNode = new SinglyLinkNode<>(extra);
            newNode.setNext(head);
            head = newNode;
        }
    }

    private int backTrack(SinglyLinkNode node) {
        if (node == null) {
            return 1;
        }

        int carry = (int) node.data + backTrack(node.getNext());
        if (carry > 9) {
            node.setData(carry % 10);
        } else {
            node.setData(carry);
        }
        return carry / 10;
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
}
