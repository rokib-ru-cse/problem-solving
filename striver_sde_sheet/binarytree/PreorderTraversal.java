package striver_sde_sheet.binarytree;


import DataStructuresAndAlgorithmsInJava.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PreorderTraversal {
    TreeNode root;
    int size = 0;

    public static void main(String[] args) {
        PreorderTraversal tree = new PreorderTraversal();
        tree.insert(100);
        tree.insert(2);
        tree.insert(10);
        tree.insert(110);
        tree.print(tree.root);
        System.out.println();
        tree.preorder(tree.root);
        System.out.println();
        tree.preorderLoop(tree.root);
    }

    private void preorder(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode currentNode = root;
        while (!stack.isEmpty() || currentNode != null) {
            if (currentNode != null) {
                System.out.print(currentNode.getData() + " ");
                stack.add(currentNode);
                currentNode = currentNode.getLeft();
            } else {
                TreeNode node = stack.pop();
                currentNode = node.getRight();
            }
        }
    }

    private void preorderLoop(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.empty()) {
            TreeNode curr = stack.pop();
            System.out.print(curr.getData() + " ");
            if (curr.getRight() != null) {
                stack.push(curr.getRight());
            }
            if (curr.getLeft() != null) {
                stack.push(curr.getLeft());
            }
        }
    }

    private void print(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.getData() + " ");
        print(root.getLeft());
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

