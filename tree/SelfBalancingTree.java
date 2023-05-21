package tree;

import java.util.LinkedList;
import java.util.Queue;

public class SelfBalancingTree {
    TreeNode root;
    int size = 0;

    public static void main(String[] args) {
        SelfBalancingTree tree = new SelfBalancingTree();
        tree.root = tree.insert(tree.root, 10);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 25);
    }

    private static int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return node.height;
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
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        } else {
            return root;
        }
        root.height = 1 + Math.max(height(root.left), height(root.right));
        int balance = getBalance(root);

        if (balance > 1 && data < root.left.data) {
            return rightRotate(root);
        }

        if (balance < -1 && data > root.right.data) {
            return leftRotate(root);
        }

        if (balance > 1 && data > root.left.data) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }
        if (balance < -1 && data < root.right.data) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }
        return root;
    }

    private TreeNode leftRotate(TreeNode root) {
        return null;
    }

    private TreeNode rightRotate(TreeNode root) {
        TreeNode left = root.left;
        TreeNode right = root.right;

        left.right = root;
        root.left = right;

        root.height = Math.max(height(root.left), height(root.right)) + 1;
        left.height = Math.max(height(left.left), height(left.right)) + 1;

        return left;
    }

    private int getBalance(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return height(root.left) - height(root.right);
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