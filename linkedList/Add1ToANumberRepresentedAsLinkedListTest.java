package linkedList;

import DataStructuresAndAlgorithmsInJava.SinglyLinkNode;

public class Add1ToANumberRepresentedAsLinkedListTest {

    SinglyLinkNode head;

    public static void main(String[] args) {
        Add1ToANumberRepresentedAsLinkedListTest head = new Add1ToANumberRepresentedAsLinkedListTest();
        head.add(1);
        head.add(5);
        head.add(6);
        head.add(7);
        head.print();
        head.addExtraOne();
        head.print();

    }

    private void addExtraOne() {
        backTrack(head, 1);
    }

    private void backTrack(SinglyLinkNode node, int extra) {
        if (node == null) {
            return;
        }

        backTrack(node.getNext(), extra);
        //extra = ((int)node.getData()+extra)/10;
        int sum = ((int) node.getData() + extra);
        extra = sum >9?1:0;
        sum = sum>9?0:sum;
        node.setData(sum);
    }

    private void print() {
        SinglyLinkNode temp = head;
        while (temp != null) {
            if (temp.getNext() == null) {
                System.out.print(temp.getData());
            } else {
                System.out.print(temp.getData() + "->");
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
