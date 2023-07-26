package linkedList;

public class Add1ToANumberRepresentedAsLinkedListTest {

    SinglyLinkNode head;

    public static void main(String[] args) {
        Add1ToANumberRepresentedAsLinkedListTest list = new Add1ToANumberRepresentedAsLinkedListTest();
        list.add(9);
        list.add(9);
        list.add(9);
        list.add(9);
        list.print();
        list.addExtraOne(list.head);
        list.print();

    }

    private void addExtraOne(SinglyLinkNode<Integer> head) {
//        int extra =  backTrack(head);
//        if(extra>0){
//            SinglyLinkNode newNode = new SinglyLinkNode<>(extra);
//            newNode.setNext(head);
//            head = newNode;
//        }
        if (head == null) {
            return;
        }
        addExtraOne(head.next);
        Integer extra = 1;
        if (head.data + extra > 9) {
            extra = 1;
            head.data = 0;
        } else {
            head.data = head.data + 1;
            extra = 0;
        }
    }

//    private int backTrack(SinglyLinkNode node) {
//        if (node == null) {
//            return 1;
//        }
//
//        int carry = (int)node.data + backTrack(node.getNext());
//        if(carry>9){
//            node.setData(carry%10);
//        }else {
//            node.setData(carry);
//        }
//        return carry/10;
//    }

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
