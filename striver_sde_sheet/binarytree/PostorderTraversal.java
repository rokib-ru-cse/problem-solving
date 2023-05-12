package striver_sde_sheet.binarytree;


import DataStructuresAndAlgorithmsInJava.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PostorderTraversal {
    TreeNode root;
    int size = 0;

    public static void main(String[] args) {
        PostorderTraversal tree = new PostorderTraversal();
        tree.insert(100);
        tree.insert(2);
        tree.insert(10);
        tree.insert(110);
        tree.insert(11);
        tree.print(tree.root);
        System.out.println();
        tree.postOrder(tree.root);
    }

    private void postOrder(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode currentNode = root;
        while (!stack.isEmpty() || currentNode != null) {
            if (currentNode != null) {
                stack.add(currentNode);
                currentNode = currentNode.getLeft();
            } else {
                TreeNode node = stack.peek().getRight();
                if (node == null) {
                    node = stack.pop();
                    System.out.print(node.getData() + " ");
                    while (!stack.isEmpty() && node == stack.peek().getRight()) {
                        node = stack.pop();
                        System.out.print(node.getData() + " ");
                    }
                } else {
                    currentNode = node;
                }
            }
        }
    }

    private void print(TreeNode root) {
        if (root == null) {
            return;
        }
        print(root.getLeft());
        print(root.getRight());
        System.out.print(root.getData() + " ");
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

