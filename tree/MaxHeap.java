package tree;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class MaxHeap {

    private HeapNode root;
    private int size;

    public MaxHeap() {
        this.root = null;
        this.size = 0;
    }

    public void insert(int value) {
        HeapNode newNode = new HeapNode(value);
        if (root == null) {
            root = newNode;
        } else {
            HeapNode curr = root;
            Queue<HeapNode> queue = new LinkedList<>();
            queue.offer(curr);
            while (!queue.isEmpty()) {
                curr = queue.poll();
                if (curr.left == null) {
                    curr.left = newNode;
                    break;
                } else if (curr.right == null) {
                    curr.right = newNode;
                    break;
                } else {
                    queue.offer(curr.left);
                    queue.offer(curr.right);
                }
            }
            // percolate up the newly inserted element
            percolateUp(newNode);
        }
        size++;
    }

    public int getMax() {
        if (root == null) {
            throw new NoSuchElementException("Heap is empty");
        }
        return root.data;
    }

    public int extractMax() {
        if (root == null) {
            throw new NoSuchElementException("Heap is empty");
        }
        int max = root.data;
        HeapNode lastNode = lastInsertedNode();
        if (lastNode == root) {
            root = null;
        } else {
            swapValues(root, lastNode);
            HeapNode parentOfLastNode = lastInsertedNode();
            if (lastNode == parentOfLastNode.left) {
                parentOfLastNode.left = null;
            } else {
                parentOfLastNode.right = null;
            }
            // percolate down the root element
            percolateDown(root);
        }
        size--;
        return max;
    }
    private HeapNode lastInsertedNode() {
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
    private void percolateUp(HeapNode node) {
//        HeapNode parent = getParent(node);
//        while (parent != null && parent.data < node.data) {
//            swapValues(node, parent);
//            node = parent;
//            parent = getParent(node);
//        }
    }

    private void percolateDown(HeapNode node) {
        while (node != null && (node.left != null || node.right != null)) {
            HeapNode leftChild = node.left;
            HeapNode rightChild = node.right;
            if (leftChild != null && rightChild != null) {
                if (leftChild.data > rightChild.data) {
                    if (node.data < leftChild.data) {
                        swapValues(node, leftChild);
                        node = leftChild;
                    } else {
                        break;
                    }
                } else {
                    if (node.data < rightChild.data) {
                        swapValues(node, rightChild);
                        node = rightChild;
                    } else {
                        break;
                    }
                }
            } else if (leftChild != null) {
                if (node.data < leftChild.data) {
                    swapValues(node, leftChild);
                    node = leftChild;
                } else {
                    break;
                }
            } else {
                if (node.data < rightChild.data) {
                    swapValues(node, rightChild);
                    node = rightChild;
                } else {
                    break;
                }
            }
        }
    }

    private void swapValues(HeapNode node1, HeapNode node2) {
        int temp = node1.data;
        node1.data = node2.data;
        node2.data = temp;
    }

}
