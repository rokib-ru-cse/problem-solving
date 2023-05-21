package striver_sde_sheet.BinaryTreepart_II;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import tree.TreeNode;

public class ZigZagTraversalofBinaryTree {
    TreeNode root;
    int size = 0;

    public static void main(String[] args) {
        ZigZagTraversalofBinaryTree tree = new ZigZagTraversalofBinaryTree();
        tree.insert(100);
        tree.insert(2);
        tree.insert(10);
        tree.insert(110);
        tree.insert(11);
//        tree.print(tree.root);
        zigzag(tree.root);
    }

    private static void zigzag(TreeNode root) {
        if (root == null) {
            return;
        }
        boolean isLeftToRight = false;
        Stack<TreeNode> currentLevel = new Stack<>();
        Stack<TreeNode> nextLevel = new Stack<>();
        currentLevel.add(root);
        while (!currentLevel.isEmpty()) {
            TreeNode node = currentLevel.pop();

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
            lastInsertedNode.left = new TreeNode(data);
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
