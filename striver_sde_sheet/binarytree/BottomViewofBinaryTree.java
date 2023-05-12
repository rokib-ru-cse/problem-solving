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
            System.out.print(node.getData() + " ");
        }
    }

    private static int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(depth(root.getLeft()), depth(root.getRight())) + 1;
    }

    private void bottomViewofBinaryTree(TreeNode root, int level, Queue<TreeNode> queue) {
        if (root == null) {
            return;
        }
        if (root.getLeft() == null && root.getRight() == null) {
            queue.add(root);
        }
        bottomViewofBinaryTree(root.getLeft(), level + 1, queue);
        bottomViewofBinaryTree(root.getRight(), level + 1, queue);
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
