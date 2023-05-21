package striver_sde_sheet.BinaryTreepart_II;

import tree.TreeNode;

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
        int left = height(root.left);
        int right = height(root.right);
        if (Math.abs(left - right) < 2 && isBalancedTree(root.left) && isBalancedTree(root.right)) {
            return true;
        }
        return false;
    }

    private int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return Math.max(height(node.left), height(node.right)) + 1;
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
