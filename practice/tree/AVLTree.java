package practice.tree;

import tree.TreeNode;

public class AVLTree {

    TreeNode root;


    public static void main(String[] args) {
        AVLTree avlTree = new AVLTree();
        avlTree.root = avlTree.insert(avlTree.root, 10);
    }

    private TreeNode insert(TreeNode root, int data) {
        if (root == null) {
            return new TreeNode(data);
        }

        if (data < this.root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        root.height = Math.max(height(root.left), height(root.right)) + 1;
        int balance = getBalance(root);
        if (balance>1 && data<root.left.data){

        }

return root;

    }

    int getBalance(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return height(root.left) - height(root.right);
    }

    int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return root.height;
    }

}
