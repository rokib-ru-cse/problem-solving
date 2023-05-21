package striver_sde_sheet.binarytree;


import DataStructuresAndAlgorithmsInJava.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class LeftViewOfBinaryTree {
    TreeNode root;
    Queue<TreeNode> queue;
    int size = 0;

    LeftViewOfBinaryTree() {
        queue = new LinkedList<>();
    }

    public static void main(String[] args) {
        LeftViewOfBinaryTree tree = new LeftViewOfBinaryTree();
        tree.insert(100);
        tree.insert(2);
        tree.insert(10);
        tree.insert(110);
        tree.insert(11);
        tree.leftViewOfBinaryTree(tree.root, 0, tree.queue);
        for (TreeNode node : tree.queue) {
            System.out.print(node.data + " ");
        }
    }

    private void leftViewOfBinaryTree(TreeNode root, int level, Queue<TreeNode> queue) {
        if (root == null) {
            return;
        }
        if (level == queue.size()) {
            queue.add(root);
        }
        leftViewOfBinaryTree(root.right, level + 1, queue);
        leftViewOfBinaryTree(root.left, level + 1, queue);
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
            lastInsertedNode.left = (new TreeNode(data));
        } else {
            lastInsertedNode.right = (new TreeNode(data));
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
