package striver_sde_sheet.binarytree;


import DataStructuresAndAlgorithmsInJava.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InorderTraversalofBinaryTree {
    TreeNode root;
    int size = 0;

    public static void main(String[] args) {
        InorderTraversalofBinaryTree tree = new InorderTraversalofBinaryTree();
        tree.insert(100);
        tree.insert(2);
        tree.insert(10);
        tree.insert(110);
        tree.print(tree.root);
        System.out.println();
        tree.printLoop(tree.root);
        System.out.println();
        tree.inOrderTraversal(tree.root);
    }

    public void inOrderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode currentNode = root;
        while (!stack.isEmpty() || currentNode != null) {
           if (currentNode!=null){
               stack.add(currentNode);
               currentNode = currentNode.getLeft();
           }else{
               TreeNode node = stack.pop();
               System.out.print(node.getData()+" ");
               currentNode = node.getRight();
           }
        }
    }

    //    public void inOrderTraversal(TreeNode root) {
//        Stack<TreeNode> stack = new Stack<>();
//        TreeNode curr = root;
//        while (!stack.empty() || curr != null) {
//            if (curr != null) {
//                stack.push(curr);
//                curr = curr.getLeft();
//            } else {
//                curr = stack.pop();
//                System.out.print(curr.getData() + " ");
//                curr = curr.getRight();
//            }
//        }
//    }
    private void printLoop(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        while (current != null || stack.size() > 0) {

            while (current != null) {
                stack.add(current);
                current = current.getLeft();
            }
            TreeNode node = stack.pop();
            System.out.print(node.getData() + " ");
            current = node.getRight();
        }
    }

    private void print(TreeNode root) {
        if (root == null) {
            return;
        }
        print(root.getLeft());
        System.out.print(root.getData() + " ");
        print(root.getRight());
    }

    private void insert(int data) {
        if (root == null) {
            root = new TreeNode(data);
            return;
        }
        TreeNode lastInsertedNode = lastInsertedNode();
        if (lastInsertedNode.getLeft() == null) {
            lastInsertedNode.setLeft(new TreeNode(data));
        } else {
            lastInsertedNode.setRight(new TreeNode(data));
        }
    }

    private TreeNode lastInsertedNode() {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode temp = q.poll();
            if (temp.getLeft() != null && temp.getRight() != null) {
                q.add(temp.getLeft());
                q.add(temp.getRight());
            } else {
                return temp;
            }
        }
        return null;
    }
}

