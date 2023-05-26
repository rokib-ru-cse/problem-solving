package heap;

import java.util.LinkedList;
import java.util.Queue;

public class MaxHeap1 {
    HeapNodeTest root;

    public static void main(String[] args) {
        MaxHeap1 maxHeap = new MaxHeap1();
        // tree.root = tree.insert(tree.root, 10);
        maxHeap.insert(40);
        maxHeap.insert(10);
        maxHeap.insert(20);
        maxHeap.insert(30);
        maxHeap.insert(25);
        maxHeap.insert(35);
        maxHeap.insert(45);
        maxHeap.print(maxHeap.root);
        int max = maxHeap.extractMax();
        System.out.println("max " + max);
        max = maxHeap.extractMax();
        System.out.println("max " + max);
        max = maxHeap.extractMax();
        System.out.println("max " + max);
        max = maxHeap.extractMax();
        System.out.println("max " + max);
        max = maxHeap.extractMax();
        System.out.println("max " + max);
        max = maxHeap.extractMax();
        System.out.println("max " + max);
        max = maxHeap.extractMax();
        System.out.println("max " + max);
        max = maxHeap.extractMax();
        System.out.println("max " + max);
        maxHeap.print(maxHeap.root);
    }

    private int extractMax() {
        if (root == null) {
            return 0;
        }
        int data = root.data;
        HeapNodeTest lastInsertedNode = lastInsertedNode(root);
        if (root == lastInsertedNode) {
            root = null;
            return data;
        }
        swap(root, lastInsertedNode);
        HeapNodeTest lastInsertedNodeParent = lastInsertedNode.parent;
        if (lastInsertedNodeParent.left == lastInsertedNode) {
            lastInsertedNodeParent.left = null;
        } else {
            lastInsertedNodeParent.right = null;
        }
        downHeapify(root);
        return data;
    }

    private void downHeapify(HeapNodeTest root) {
        HeapNodeTest largest = root;
        if (root.left != null && root.left.data > root.data) {
            largest = root.left;
        }
        if (root.right != null && root.right.data > root.data) {
            largest = root.right;
        }
        if (largest != root) {
            swap(root, largest);
            downHeapify(largest);
        }
    }

    /*
    * private void downHeapify(HeapNode root) {
        HeapNode largest = root;
        if (root.left != null && root.left.data > largest.data) {
            largest = root.left;
        }
        if (root.right != null && root.right.data > largest.data) {
            largest = root.right;
        }
        if (largest != root) {
            swap(root, largest);
            downHeapify(largest);
        }
    }
    * */

    private void swap(HeapNodeTest root, HeapNodeTest lastInsertedNode) {
        int temp = root.data;
        root.data = lastInsertedNode.data;
        lastInsertedNode.data = temp;
    }

    private HeapNodeTest lastInsertedNode(HeapNodeTest root) {
        Queue<HeapNodeTest> allNodes = new LinkedList<>();
        allNodes.add(root);
        while (!allNodes.isEmpty()) {
            HeapNodeTest tempNode = allNodes.poll();
            if (tempNode.left != null) {
                allNodes.add(tempNode.left);
            }
            if (tempNode.right != null) {
                allNodes.add(tempNode.right);
            }
            if (tempNode.left == null && tempNode.right == null) {
                return tempNode;
            }
        }
        return null;
    }

    private void print(HeapNodeTest root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + "->");
        print(root.left);
        print(root.right);
    }

    private void insert(int data) {
        if (root == null) {
            root = new HeapNodeTest(data);
            return;
        }
        HeapNodeTest newNode = new HeapNodeTest(data);
        HeapNodeTest lastInsertedNode = lastInsertedNodeOrParent(root);
        if (lastInsertedNode.left == null) {
            lastInsertedNode.left = newNode;
        } else {
            lastInsertedNode.right = newNode;
        }
        newNode.parent = lastInsertedNode;
        upheapify(newNode);
    }

    private void upheapify(HeapNodeTest newNode) {
        if (newNode.parent == null) {
            return;
        }
        if (newNode.data > newNode.parent.data) {

            int temp = newNode.data;
            newNode.data = newNode.parent.data;
            newNode.parent.data = temp;
            upheapify(newNode.parent);
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
