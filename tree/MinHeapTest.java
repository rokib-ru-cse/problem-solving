package tree;

import java.util.LinkedList;
import java.util.Queue;

public class MinHeapTest {
    HeapNode root;

    public static void main(String[] args) {
        MinHeapTest minHeap = new MinHeapTest();
        minHeap.add(40);
        minHeap.add(10);
        minHeap.add(20);
        minHeap.add(30);
        minHeap.add(25);
        minHeap.add(35);
        minHeap.add(45);
        minHeap.print(minHeap.root);
    }

    private void add(int data) {
        if (root == null) {
            root = new HeapNode(data);
            return;
        }
        HeapNode newNode = new HeapNode(data);
        HeapNode lastParent = lastParent(root);
        if(lastParent.left==null){
            lastParent.left = newNode;
        }else{
            lastParent.right = newNode;
        }
        newNode.parent = lastParent;
        upHeapify(newNode);
    }

    private void upHeapify(HeapNode newNode) {
        if (newNode.parent==null){
            return;
        }
        if(newNode.parent.data>newNode.data){
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

    private void print(HeapNode root) {
        if (root == null) {
            return;
        }
        print(root.left);
        System.out.print(root.data + "->");
        print(root.right);
    }

}