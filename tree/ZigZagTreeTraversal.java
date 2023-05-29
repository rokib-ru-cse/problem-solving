package tree;

import tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ZigZagTreeTraversal {

    TreeNode root;

    public static void main(String[] args) {
        ZigZagTreeTraversal tree = new ZigZagTreeTraversal();
        tree.root = new TreeNode(10);

        tree.root.left = new TreeNode(5);
        tree.root.right = new TreeNode(15);

        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(6);

        tree.root.right.left = new TreeNode(11);
        tree.root.right.right = new TreeNode(20);
        tree.print(tree.root);

        /*
         *           10
         *          /   \
         *         5     15
         *       /  \    /  \
         *      4    6  11   20
         *
         *
         * */
    }

    private void print(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> currentLevel = new Stack<>();
        Stack<TreeNode> nextLevel = new Stack<>();
        currentLevel.add(root);
        boolean isLeftToRight = true;
        while (!currentLevel.isEmpty()) {
            TreeNode temp = currentLevel.pop();
            System.out.print(temp.data + " ");
            if (isLeftToRight) {
                if (temp.left != null) {
                    nextLevel.add(temp.left);
                }
                if (temp.right != null) {
                    nextLevel.add(temp.right);
                }
            } else {
                if (temp.right != null) {
                    nextLevel.add(temp.right);
                }
                if (temp.left != null) {
                    nextLevel.add(temp.left);
                }
            }
            if (currentLevel.isEmpty()) {
                currentLevel = nextLevel;
                nextLevel = new Stack<>();
                isLeftToRight = !isLeftToRight;
            }

        }

    }
}
