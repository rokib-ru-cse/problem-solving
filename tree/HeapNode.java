package tree;

public class HeapNode {
    int data;
    HeapNode left;
    HeapNode right;
    HeapNode parent;

    HeapNode() {

    }

    HeapNode(int data) {
        this.data = data;
        left = null;
        right = null;
        parent = null;
    }


}
