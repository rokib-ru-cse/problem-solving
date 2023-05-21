package tree;

import tree.TreeNode;


public class SelfBalancingTreeTest {
    TreeNode root;


    public static void main(String[] args) {
        SelfBalancingTreeTest tree = new SelfBalancingTreeTest();
        tree.root = tree.insert(tree.root, 10);
        tree.root = tree.insert(tree.root, 11);
        tree.root = tree.insert(tree.root, 13);
        tree.root = tree.insert(tree.root, 2);
        tree.root = tree.insert(tree.root, 31);
        tree.root = tree.insert(tree.root, 4);
        tree.root = tree.insert(tree.root, 55);
        tree.root = tree.insert(tree.root, 33);
        tree.root = tree.insert(tree.root, 3);
        tree.root = tree.insert(tree.root, 1);
        tree.root = tree.insert(tree.root, 12);
        tree.root = tree.insert(tree.root, 43);
        tree.root = tree.insert(tree.root, 54);
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
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        } else {
            return root;
        }

        root.height = 1 + Math.max(height(root.left), height(root.right));
        int balance = getBalance(root);

        if (balance > 1 && data < root.left.data) {
            return rightRotation(root);
        }
        if (balance < -1 && data > root.right.data) {
            return leftRotation(root);
        }
        if (balance > 1 && data > root.left.data) {
            root.left = leftRotation(root.left);
            return rightRotation(root);
        }
        if (balance < -1 && data < root.right.data) {
            root.right = rightRotation(root.right);
            return leftRotation(root);
        }
        return root;
    }

    private TreeNode leftRotation(TreeNode root) {
        TreeNode temp1 = root.right;
        TreeNode temp2 = root.left;

        temp1.left = root;
        root.right = temp2;

        root.height = Math.max(height(root.left), height(root.right)) + 1;
        temp1.height = Math.max(height(temp1.left), height(temp1.right)) + 1;

        return temp1;
    }

    private TreeNode rightRotation(TreeNode root) {
        TreeNode temp1 = root.left;
        TreeNode temp2 = root.right;

        temp1.right = root;
        root.left = temp2;

        root.height = Math.max(height(root.left), height(root.right)) + 1;
        temp1.height = Math.max(height(temp1.left), height(temp1.right)) + 1;

        return temp1;
    }

    private int getBalance(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return height(root.left) - height(root.right);
    }

    private int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return node.height;
    }


}
