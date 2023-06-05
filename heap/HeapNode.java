package heap;

public class HeapNode {
    public int data;
    public HeapNode left;
    public HeapNode right;
    public HeapNode parent;

    public HeapNode() {

    }

    public HeapNode(int data) {
        this.data = data;
        left = null;
        right = null;
        parent = null;
    }


}
