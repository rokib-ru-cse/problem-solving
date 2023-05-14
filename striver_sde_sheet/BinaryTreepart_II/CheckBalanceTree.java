package striver_sde_sheet.BinaryTreepart_II;

import DataStructuresAndAlgorithmsInJava.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class CheckBalanceTree {
    TreeNode root;
    int size = 0;

    public static void main(String[] args) {
        CheckBalanceTree tree = new CheckBalanceTree();
        tree.insert(100);
        tree.insert(2);
        tree.insert(10);
        tree.insert(110);
        if (tree.isBalancedTree(tree.root)) {
            System.out.println("tree is balanced");
        } else {
            System.out.println("tree is not balanced");
        }
    }

    private boolean isBalancedTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        int left = height(root.getLeft());
        int right = height(root.getRight());
        if (Math.abs(left - right) < 2 && isBalancedTree(root.getLeft()) && isBalancedTree(root.getRight())) {
            return true;
        }
        return false;
    }

    private int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return Math.max(height(node.getLeft()), height(node.getRight())) + 1;
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
