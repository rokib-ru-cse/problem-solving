package practice.tree;


import tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ZigZagTreeTraversal {

    TreeNode root;


    public static void main(String[] args) {
        ZigZagTreeTraversal tree = new ZigZagTreeTraversal();
        tree.root = tree.insert(10);
        tree.root = tree.insert(5);
        tree.root = tree.insert(12);
        tree.root = tree.insert(1);
        tree.root = tree.insert(6);
        tree.root = tree.insert(11);
        tree.root = tree.insert(20);

        tree.print(tree.root);
        System.out.println();
        tree.printZigZag(tree.root);
    }

    private void printZigZag(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> currentLevel = new Stack<>();
        Stack<TreeNode> nextLevel = new Stack<>();
        boolean isLeftToRight = true;
        currentLevel.add(root);
        while (!currentLevel.isEmpty()) {
            TreeNode temp = currentLevel.pop();
            System.out.print(temp.data + " ");
            if (isLeftToRight) {
                if (temp.left != null) {
                    nextLevel.add(temp.left);
                }
                if (temp.right != null) {
                    nextLevel.add(temp.right);
                }
            } else {
                if (temp.right != null) {
                    nextLevel.add(temp.right);
                }
                if (temp.left != null) {
                    nextLevel.add(temp.left);
                }
            }
            if (currentLevel.isEmpty()) {
                currentLevel = nextLevel;
                nextLevel = new Stack<>();
                isLeftToRight = !isLeftToRight;
            }
        }
    }

    private void print(TreeNode root) {
        if (root == null) {
            return;
        }
        print(root.left);
        System.out.print(root.data + " ");
        print(root.right);
    }

    private TreeNode insert(int data) {
        if (root == null) {
            root = new TreeNode(data);
            return root;
        }

        TreeNode lastInsertedNodeParent = lastInsertedNodeParent(root);
        if (lastInsertedNodeParent.left == null) {
            lastInsertedNodeParent.left = new TreeNode(data);
        } else {
            lastInsertedNodeParent.right = new TreeNode(data);
        }
        return root;
    }

    private TreeNode lastInsertedNodeParent(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            if (temp.left != null && temp.right != null) {
                queue.add(temp.left);
                queue.add(temp.right);
            } else {
                return temp;
            }
        }
        return null;
    }


}