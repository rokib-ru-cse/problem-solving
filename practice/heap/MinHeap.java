package practice.heap;

import heap.HeapNode;
import heap.HeapNodeTest;

import java.util.LinkedList;
import java.util.Queue;

public class MinHeap {

    HeapNode root;

    public static void main(String[] args) {
        MinHeap tree = new MinHeap();
        tree.add(40);
        tree.add(10);
        tree.add(20);
        tree.add(30);
        tree.add(25);
        tree.add(35);
        tree.add(45);
        //tree.print(tree.root);
        int min = tree.extractMin();
        System.out.println("min " + min);
        min = tree.extractMin();
        System.out.println("min " + min);
        min = tree.extractMin();
        System.out.println("min " + min);
        min = tree.extractMin();
        System.out.println("min " + min);
        min = tree.extractMin();
        System.out.println("min " + min);
        min = tree.extractMin();
        System.out.println("min " + min);
        min = tree.extractMin();
        System.out.println("min " + min);
    }

    private int extractMin() {
        if (root == null) {
            return 0;
        }
        int returnData = root.data;

        HeapNode lastInsertedNode = lastInsertedNode();
        if (lastInsertedNode == root) {
            root = null;
            return returnData;
        }

        swap(lastInsertedNode, root);
        HeapNode lastInsertedNodeParent = lastInsertedNode.parent;
        if (lastInsertedNodeParent.left == lastInsertedNode) {
            lastInsertedNodeParent.left = null;
        } else {
            lastInsertedNodeParent.right = null;
        }
        downHeapify(root);
//        System.out.println("xxxxxxxxx "+lastInsertedNode.data);
        return returnData;
    }

    //    private void downHeapify(HeapNode root) {
//        if (root == null) {
//            return;
//        }
//        HeapNode minValueNode = root;
//        if (root.left != null && root.left.data < minValueNode.data) {
//            minValueNode = root.left;
//            swap(minValueNode, root);
//            downHeapify(minValueNode);
//        }
//        if (root.right != null && root.right.data < minValueNode.data) {
//            minValueNode = root.right;
//            swap(minValueNode, root);
//            downHeapify(minValueNode);
//        }
//    }
    private void downHeapify(HeapNode root) {
        HeapNode minValueNode = root;
        if (root.left != null && root.left.data < minValueNode.data) {
            minValueNode = root.left;
//        swap(minValueNode, root);
//        downHeapify(minValueNode);
        }
        if (root.right != null && root.right.data < minValueNode.data) {
            minValueNode = root.right;
//        swap(minValueNode, root);
//        downHeapify(minValueNode);
        }
        if (minValueNode != root) {
            swap(minValueNode, root);
            downHeapify(minValueNode);
        }
    }

    private HeapNode lastInsertedNode() {
        Queue<HeapNode> nodes = new LinkedList<>();
        nodes.add(root);
        HeapNode temp = null;
        while (!nodes.isEmpty()) {
            temp = nodes.poll();
            if (temp.left != null) {
                nodes.add(temp.left);
            }
            if (temp.right != null) {
                nodes.add(temp.right);
            }
        }
        return temp;
    }

    /*
     *       10
     *      /  \
     *    25    20
     *   /  \   / \
     *  40  30 35  45
     *
     *
     *
     * */

    private void print(HeapNode root) {
        if (root == null) {
            return;
        }
        print(root.left);
        System.out.print(root.data + " ");
        print(root.right);
    }

    private void add(int data) {
        if (root == null) {
            root = new HeapNode(data);
            return;
        }
        HeapNode newNode = new HeapNode(data);

        HeapNode lastInsertedParentNode = lastInsertedParentNode(root);
        if (lastInsertedParentNode.left == null) {
            lastInsertedParentNode.left = newNode;
        } else {
            lastInsertedParentNode.right = newNode;
        }
        newNode.parent = lastInsertedParentNode;
        upHeapify(newNode);
    }

    private void upHeapify(HeapNode node) {
        if (node.parent == null) {
            return;
        }
        if (node.parent.data > node.data) {
            swap(node.parent, node);
            upHeapify(node.parent);
        }
    }

    void swap(HeapNode node1, HeapNode node2) {
        int tempData = node1.data;
        node1.data = node2.data;
        node2.data = tempData;
    }

    private HeapNode lastInsertedParentNode(HeapNode root) {
        Queue<HeapNode> nodes = new LinkedList<>();
        nodes.add(root);
        while (!nodes.isEmpty()) {
            HeapNode temp = nodes.poll();
            if (temp.left != null && temp.right != null) {
                nodes.add(temp.left);
                nodes.add(temp.right);
            } else {
                return temp;
            }
        }
        return null;
    }
}
