package striver_sde_sheet.binarytree;


import DataStructuresAndAlgorithmsInJava.TreeNode;

import java.util.LinkedList;
import java.util.Queue;


public class BottomViewofBinaryTree {
    TreeNode root;
    int size = 0;
    Queue<TreeNode> queue;

    BottomViewofBinaryTree() {
        queue = new LinkedList<>();
    }

    public static void main(String[] args) {
        BottomViewofBinaryTree tree = new BottomViewofBinaryTree();
        tree.insert(100);
        tree.insert(2);
        tree.insert(10);
        tree.insert(110);
        tree.insert(11);
        //int depth = depth(tree.root);
        //System.out.println(depth);
        tree.bottomViewofBinaryTree(tree.root, 0, tree.queue);
        for (TreeNode node : tree.queue) {
            System.out.print(node.data + " ");
        }
    }

    private static int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(depth(root.left), depth(root.right)) + 1;
    }

    private void bottomViewofBinaryTree(TreeNode root, int level, Queue<TreeNode> queue) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            queue.add(root);
        }
        bottomViewofBinaryTree(root.left, level + 1, queue);
        bottomViewofBinaryTree(root.right, level + 1, queue);
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
