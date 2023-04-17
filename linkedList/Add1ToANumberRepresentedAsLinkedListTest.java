package linkedList;

import DataStructuresAndAlgorithmsInJava.SinglyLinkNode;

public class Add1ToANumberRepresentedAsLinkedListTest {

    SinglyLinkNode head;

    public static void main(String[] args) {
        Add1ToANumberRepresentedAsLinkedListTest head = new Add1ToANumberRepresentedAsLinkedListTest();
        head.add(9);
        head.add(9);
        head.add(9);
        head.add(9);
        head.print();
        head.addExtraOne();
        head.print();

    }

    private void addExtraOne() {
        int extra =  backTrack(head, 0);
        if(extra>0){
            SinglyLinkNode newNode = new SinglyLinkNode<>(extra);
            newNode.setNext(head);
            head = newNode;
        }
    }

    private int backTrack(SinglyLinkNode node, int extra) {
        if (node == null) {
            return 1;
        }

        int carry = (int)node.getData() + backTrack(node.getNext(),(int)node.getData());
        if(carry>9){
            node.setData(carry%10);
        }else {
            node.setData(carry);
        }
        return carry/10;
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
