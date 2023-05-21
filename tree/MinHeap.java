package tree;


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
        tree.print(tree.root);

    }

    private void print(HeapNode root) {
        if (root == null) {
            return;
        }
        print(root.left);
        System.out.print(root.data + "->");
        print(root.right);
    }

    private void add(int data) {
        if (root == null) {
            root = new HeapNode(data);
            return;
        }
        HeapNode newNode = new HeapNode(data);
        HeapNode lastParentNode = lastParentNode(root);
        if (lastParentNode.left == null) {
            lastParentNode.left = newNode;
        } else {
            lastParentNode.right = newNode;
        }
        newNode.parent = lastParentNode;
        heapify(newNode);
    }

    private void heapify(HeapNode newNode) {
        if (newNode.parent == null) {
            return;
        }
        if (newNode.parent.data > newNode.data) {
            int tempData = newNode.parent.data;
            newNode.parent.data = newNode.data;
            newNode.data = tempData;
            heapify(newNode.parent);
        }
    }


    private HeapNode lastParentNode(HeapNode root) {
        Queue<HeapNode> allNodes = new LinkedList<>();
        allNodes.add(root);
        while (!allNodes.isEmpty()) {
            HeapNode temp = allNodes.poll();
            if (temp.left != null && temp.right != null) {
                allNodes.add(temp.left);
                allNodes.add(temp.right);
            } else {
                return temp;
            }
        }
        return null;
    }
}
