package DSImplementation;


public class MinHeap {

    TreeNode root;

    MinHeap() {

    }

    MinHeap(int data) {
        root = new TreeNode(data);
    }

    public static void main(String[] args) {
        BSTTest tree = new BSTTest();
        tree.insert(40);

    }
}
