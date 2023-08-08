package practice.heap;


import heap.HeapNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MinHeap {

    HeapNode root;

    private static void insert(MinHeap tree, int data) {
        HeapNode newNode = new HeapNode(data);
        if (tree.root == null) {
            tree.root = new HeapNode(data);
            return;
        }
        HeapNode lastInsertedNodeParent = lastInsertedNodeParent(tree.root);
        if (lastInsertedNodeParent.left == null) {
            lastInsertedNodeParent.left = newNode;
        } else {
            lastInsertedNodeParent.right = newNode;
        }
        newNode.parent = lastInsertedNodeParent;
        upHeapify(newNode);

    }

    private static void upHeapify(HeapNode newNode) {
        if (newNode.parent == null) {
            return;
        }
        if (newNode.parent.data > newNode.data) {
            swap(newNode.parent, newNode);
            upHeapify(newNode.parent);
        }
    }

    private static void swap(HeapNode parent, HeapNode newNode) {
        int temp = parent.data;
        parent.data = newNode.data;
        newNode.data = temp;
    }

    private static HeapNode lastInsertedNodeParent(HeapNode root) {
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

    public static void main(String[] args) {
        MinHeap tree = new MinHeap();
        tree.insert(tree, 40);
        tree.insert(tree, 10);
        tree.insert(tree, 20);
        tree.insert(tree, 30);
        tree.insert(tree, 25);
        tree.insert(tree, 35);
        tree.insert(tree, 45);
        print(tree.root);
    }


    private static void print(HeapNode root) {
        if (root == null) {
            return;
        }
        print(root.left);
        System.out.print(root.data + "->");
        print(root.right);
    }


}