package tree;

import DataStructuresAndAlgorithmsInJava.TreeNode;

import java.util.*;

public class ZigZagTreeTraversal {
    TreeNode root;
    int size = 0;

    public static void main(String[] args) {
        ZigZagTreeTraversal tree = new ZigZagTreeTraversal();
        tree.insert(100);
        tree.insert(2);
        tree.insert(10);
        tree.insert(110);
        tree.insert(11);
        tree.insert(12);
        tree.insert(13);
        tree.insert(14);
        tree.insert(15);
        tree.insert(16);
        //tree.print(tree.root);
        System.out.println();
        tree.printZigZag(tree.root);
    }

    private void printZigZag(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> currentLevel = new Stack<>();
        Stack<TreeNode> nextLevel = new Stack<>();
        currentLevel.add(root);
        boolean isLeftToRight = true;


        while (!currentLevel.isEmpty()) {
            TreeNode node = currentLevel.pop();
            System.out.print(node.data + " ");
            if (isLeftToRight) {
                if (node.left != null) {
                    nextLevel.add(node.left);
                }
                if (node.right != null) {
                    nextLevel.add(node.right);
                }
            } else {
                if (node.right != null) {
                    nextLevel.add(node.right);
                }
                if (node.left != null) {
                    nextLevel.add(node.left);
                }
            }
            if(currentLevel.isEmpty()){
                isLeftToRight = !isLeftToRight;
                Stack<TreeNode> temp = new Stack<>();
                currentLevel = nextLevel;
                nextLevel = temp;
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

    private void insert(int data) {
        if (root == null) {
            root = new TreeNode(data);
            return;
        }
        TreeNode lastInsertedNode = lastInsertedNode();
        if (lastInsertedNode.left == null) {
            lastInsertedNode.left =new TreeNode(data);
        } else {
            lastInsertedNode.right = new TreeNode(data);
        }
    }

    private TreeNode lastInsertedNode() {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode temp = q.poll();
            if (temp.left != null && temp.right != null) {
                q.add(temp.left);
                q.add(temp.right);
            } else {
                return temp;
            }
        }
        return null;
    }
}