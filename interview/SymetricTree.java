package interview;

import tree.TreeNode;

public class SymetricTree {

    TreeNode root;

    /*
     *             10
     *        3         3
     *       / \        /  \
     *     1    2       1    2
     *    / \   /\     / \   /\
     *   10  11 15 16 10  11 15 16
     * */
    public static void main(String[] args) {
        SymetricTree tree = new SymetricTree();
        tree.root = new TreeNode(10);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(2);

        tree.root.left.left = new TreeNode(1);
        tree.root.left.right = new TreeNode(2);

        tree.root.right.left = new TreeNode(1);
        tree.root.right.right = new TreeNode(2);

        tree.root.left.left.left = new TreeNode(10);
        tree.root.left.left.right = new TreeNode(11);

        tree.root.left.right.left = new TreeNode(15);
        tree.root.left.right.right = new TreeNode(16);

        tree.root.right.left.left = new TreeNode(10);
        tree.root.right.left.right = new TreeNode(11);

        tree.root.right.right.left = new TreeNode(15);
        tree.root.right.right.right = new TreeNode(16);

        System.out.println(tree.isSymetric(tree.root));
/**
 *
 *
 * shonteco?
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */


    }

    private boolean isSymetric(TreeNode root) {
        return isSymetric(root.left, root.right);
    }

    private boolean isSymetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left.data == right.data && isSymetric(left.left, right.left) && isSymetric(left.right, right.right)) {
            return true;
        } else {
            return false;
        }
    }
}
