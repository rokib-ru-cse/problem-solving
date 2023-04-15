package DSImplementation;

import java.util.LinkedList;
import java.util.Queue;

public class MaxHeap {

    HeapNode root;
    MaxHeap(){
        root = null;
    }
    MaxHeap(int data){
        root = new HeapNode(data);
    }


    public static void main(String[] args) {
        MaxHeap tree = new MaxHeap();
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
        if (root==null){
            return;
        }
        print(root.left);
        System.out.print(root.data+"->");
        print(root.right);
    }

    private void add(int data) {
        HeapNode newNode = new HeapNode(data);
        if(root==null){
            root = newNode;
            return;
        }
        HeapNode lastParent = lastParent(root);
        if(lastParent.left==null){
            lastParent.left=newNode;
        }else{
            lastParent.right=newNode;
        }
        newNode.parent = lastParent;
        heapify(newNode);
    }

    private void heapify(HeapNode newNode) {
        if(newNode.parent==null){
            return;
        }
        if(newNode.parent.data<newNode.data){
            int tempdata = newNode.parent.data;
            newNode.parent.data = newNode.data;
            newNode.data = tempdata;
            heapify(newNode.parent);
        }else{
            return;
        }
    }

    private HeapNode lastParent(HeapNode root) {
        Queue<HeapNode> allNodes = new LinkedList<>();
        allNodes.add(root);
        while (!allNodes.isEmpty()){
            HeapNode temp = allNodes.poll();
            if(temp.left!=null && temp.right!=null){
                allNodes.add(temp.left);
                allNodes.add(temp.right);
            }else{
                return temp;
            }
        }
        return null;
    }
}
