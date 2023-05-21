package tree;

import java.util.LinkedList;
import java.util.Queue;

public class MaxHeapTest {
    HeapNode root;
/*
*Fields:

heap: an array that represents the underlying binary tree structure of the max-heap
size: the number of elements currently in the max-heap
Methods:

insert(value): inserts a new element with the given value into the max-heap while maintaining the max-heap property
peek(): returns the maximum element in the max-heap without removing it
extract_max(): removes and returns the maximum element in the max-heap while maintaining the max-heap property
heapify(arr): creates a max-heap from the given array by repeatedly calling the insert method on each element in the array
build_heap(arr): builds a max-heap from the given array using a bottom-up approach, which has a time complexity of O(n) compared to O(n log n) for heapify
remove(value): removes the element with the given value from the max-heap while maintaining the max-heap property
is_empty(): returns a boolean indicating whether the max-heap is empty or not
clear(): removes all elements from the max-heap
I hope this helps! Let me know if you have any further questions.
*
*
*
* */
    public static void main(String[] args) {
        MaxHeapTest maxHeap = new MaxHeapTest();
        maxHeap.add(40);
        maxHeap.add(10);
        maxHeap.add(20);
        maxHeap.add(30);
        maxHeap.add(25);
        maxHeap.add(35);
        maxHeap.add(45);
        maxHeap.print(maxHeap.root);
        int max = maxHeap.extractMax();
        System.out.println("max "+max);
        maxHeap.print(maxHeap.root);
    }

    private void print(HeapNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + "->");
        print(root.left);
        print(root.right);
    }

    private void add(int data) {
        if (root == null) {
            root = new HeapNode(data);
            return;
        }
        HeapNode newNode = new HeapNode(data);
        HeapNode lastParent = lastParent(root);
        if (lastParent.left == null) {
            lastParent.left = newNode;
        } else {
            lastParent.right = newNode;
        }
        newNode.parent = lastParent;
        upHeapify(newNode);
    }

    private void upHeapify(HeapNode newNode) {
        if (newNode.parent == null) {
            return;
        }
        if (newNode.parent.data < newNode.data) {
            int data = newNode.parent.data;
            newNode.parent.data = newNode.data;
            newNode.data = data;
            upHeapify(newNode.parent);
        }
    }

    private HeapNode lastParent(HeapNode root) {
        Queue<HeapNode> allNodes = new LinkedList<>();
        allNodes.add(root);
        while (!allNodes.isEmpty()) {
            HeapNode tempNode = allNodes.poll();
            if (tempNode.left != null && tempNode.right != null) {
                allNodes.add(tempNode.left);
                allNodes.add(tempNode.right);
            } else {
                return tempNode;
            }
        }
        return null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public int extractMax() {
        if (isEmpty()) {
            return 0;
        }
        int returnData = root.data;
        HeapNode lastInsertedNode = lastParent(root);
        if (root == lastInsertedNode) {
            root = null;
            return returnData;
        }
        swap(root, lastInsertedNode);
        HeapNode lastNodeParent = lastInsertedNode.parent;
        if (lastNodeParent.left == lastInsertedNode) {
            lastNodeParent.left = null;
        } else {
            lastNodeParent.right = null;
        }
        downHeapify(root);
        return returnData;
    }

    private void downHeapify(HeapNode root) {
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

    public void swap(HeapNode node1, HeapNode node2) {
        int temp = node1.data;
        node1.data = node2.data;
        node2.data = temp;
    }
}