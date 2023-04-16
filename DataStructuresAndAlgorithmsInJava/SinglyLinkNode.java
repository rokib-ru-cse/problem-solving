package DataStructuresAndAlgorithmsInJava;

public class SinglyLinkNode {
    int data;
    SinglyLinkNode next;

    SinglyLinkNode() {

    }

    SinglyLinkNode(int data) {
        this.data = data;
        this.next = null;
    }

    SinglyLinkNode(SinglyLinkNode node, int data) {
        this.data = data;
        this.next = node;
    }

}
