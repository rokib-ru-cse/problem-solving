package practice.tree;

import tree.TreeNode;

public class AVLTree {

    TreeNode root;

    public static void main(String[] args) {
        AVLTree tree = new AVLTree();
        tree.root = tree.insert(tree.root, 10);
        tree.root = tree.insert(tree.root, 1);
        tree.root = tree.insert(tree.root, 1);
        tree.root = tree.insert(tree.root, 11);
        tree.root = tree.insert(tree.root, 12);
        tree.root = tree.insert(tree.root, 13);
        tree.root = tree.insert(tree.root, 15);
        tree.root = tree.insert(tree.root, 21);
        tree.root = tree.insert(tree.root, 33);
        tree.print(tree.root);
    }

    private void print(TreeNode root) {
        if (root == null) {
            return;
        }
        print(root.left);
        System.out.print(root.data + " ");
        print(root.right);
    }

    private TreeNode insert(TreeNode root, int data) {
        if (root == null) {
            root = new TreeNode(data);
            return root;
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }

        root.height = Math.max(height(root.left), height(root.right)) + 1;
        int balance = getBalance(root);
        if (balance > 1 && data < root.left.data) {
            return rightRotation(root.left);
        }
        if (balance < -1 && data > root.right.data) {
            return leftRotation(root.right);
        }

        if (balance > 1 && data > root.left.data) {
            root.left = leftRotation(root.left);
            return rightRotation(root);
        }
        if (balance < -1 && data < root.right.data) {
            root.right = rightRotation(root.right);
            return rightRotation(root);
        }
        return root;
    }

    private TreeNode leftRotation(TreeNode node) {
        TreeNode left = node.left;
        TreeNode right = node.right;
        right.left = node;
        node.right = left;

        node.height = Math.max(height(node.left), height(node.right)) + 1;
        right.height = Math.max(height(right.left), height(right.right)) + 1;

        return right;
    }

    private TreeNode rightRotation(TreeNode node) {
        TreeNode leftNode = node.left;
        TreeNode rightNode = node.right;

        leftNode.right = node;
        node.left = rightNode;

        node.height = Math.max(height(node.left), height(node.right)) + 1;
        leftNode.height = Math.max(height(leftNode.left), height(leftNode.right)) + 1;

        return leftNode;
    }

    private int getBalance(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return height(root.left) - height(root.right);
    }

    private int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return root.height;
    }
}
