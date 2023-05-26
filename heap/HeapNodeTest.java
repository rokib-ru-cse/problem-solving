package heap;

public class HeapNodeTest {
    public int data;
    public HeapNodeTest left;
    public HeapNodeTest right;
    public HeapNodeTest parent;

    HeapNodeTest() {
    }

    HeapNodeTest(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
        this.parent = null;
    }
}
