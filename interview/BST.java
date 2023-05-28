package interview;

import tree.TreeNode;

public class BST {
    TreeNode root;

    BST() {
        root = new TreeNode();
    }

    public static boolean isBST(TreeNode node, Integer min, Integer max) {
        if (node == null) {
            return true;
        }
        if (max != null && max < node.data) {
            return false;
        }
        if (min != null && min > node.data) {
            return false;
        }
        if (isBST(node.left, min, node.data) && isBST(node.right, node.data, max)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        BST tree = new BST();
        tree.root = new TreeNode(10);
        tree.root.left = new TreeNode(5);
        tree.root.right = new TreeNode(12);


        tree.root.left.left = new TreeNode(1);
        tree.root.left.right = new TreeNode(6);

        tree.root.right.left = new TreeNode(11);
        tree.root.right.right = new TreeNode(13);

        System.out.println(isBST(tree.root, null, null));

        /*
         *
         *           10
         *          /  \
         *         5     12
         *        /\     / \
         *       1  6   11   13
         *
         *
         *
         *
         * */
    }
}
