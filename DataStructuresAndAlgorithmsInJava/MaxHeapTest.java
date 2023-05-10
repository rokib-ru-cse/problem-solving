package DataStructuresAndAlgorithmsInJava;

import java.util.LinkedList;
import java.util.Queue;

public class MaxHeapTest {
    HeapNode root;

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
    }

    private void print(HeapNode root) {
        if (root==null){
            return;
        }
        print(root.left);
        System.out.print(root.data+"->");
        print(root.right);
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
        if(newNode.parent==null){
            return;
        }
        if (newNode.parent.data<newNode.data){
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
    public boolean isEmpty(){
        return root==null;
    }
    public HeapNode extractMax(){
        if(isEmpty()){
            return null;
        }
        HeapNode returnNode = root;
        HeapNode lastInsertedNode = lastParent(root);
        if(root==lastInsertedNode){
            root = null;
            return returnNode;
        }
        swap(root,lastInsertedNode);
        HeapNode lastNodeParent = lastInsertedNode.parent;
        if(lastNodeParent.left==lastInsertedNode){
            lastNodeParent.left = null;
        }else{
            lastNodeParent.right = null;
        }
        downHeapify(root);
        return returnNode;
    }

    private void downHeapify(HeapNode root) {

    }

    public void swap(HeapNode node1,HeapNode node2){
        int temp = node1.data;
        node1.data = node2.data;
        node2.data = temp;
    }
}