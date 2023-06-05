package practice.tree;

import tree.TreeNode;

public class AVLTree {

    TreeNode root;

    public static void main(String[] args) {
        AVLTree tree = new AVLTree();
        tree.root = tree.insert(tree.root, 10);
    }

    private TreeNode insert(TreeNode root, int data) {
        if (root == null) {
            root = new TreeNode(data);
            return root;
        }
        if (data < root.left.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }

        root.height = height(root);

return null;
    }

    private int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return root.height;
    }
}
