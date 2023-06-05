package heap;

import java.util.LinkedList;
import java.util.Queue;

public class MinHeap1 {

    HeapNodeTest root;


    public static void main(String[] args) {
        MinHeap1 tree = new MinHeap1();
        tree.add(40);
        tree.add(10);
        tree.add(20);
        tree.add(30);
        tree.add(25);
        tree.add(35);
        tree.add(45);
        tree.print(tree.root);
    }

    private void print(HeapNodeTest root) {
        if (root == null) {
            return;
        }
        print(root.left);
        System.out.print(root.data + " ");
        print(root.right);
    }

    private void add(int data) {
        if (root == null) {
            root = new HeapNodeTest(data);
            return;
        }
        HeapNodeTest newNode = new HeapNodeTest(data);
        HeapNodeTest lastInsertedNodeOrParent = lastInsertedNodeOrParent(root);
        if (lastInsertedNodeOrParent.left == null) {
            lastInsertedNodeOrParent.left = newNode;
        } else {
            lastInsertedNodeOrParent.right = newNode;
        }
        newNode.parent = lastInsertedNodeOrParent;
        upHeapify(newNode);
    }

    private void upHeapify(HeapNodeTest newNode) {
        if (newNode.parent == null) {
            return;
        }
        if (newNode.parent.data > newNode.data) {

        }
    }

    private HeapNodeTest lastInsertedNodeOrParent(HeapNodeTest root) {
        Queue<HeapNodeTest> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            HeapNodeTest temp = queue.poll();
            if (temp.left != null && temp.right != null) {
                queue.add(temp.left);
                queue.add(temp.right);
            } else {
                return temp;
            }
        }
        return null;
    }
}
