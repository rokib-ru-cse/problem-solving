package practice.tree;

import tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class CheckForBST {
    TreeNode root;
    int size = 0;

    public static void main(String[] args) {
        CheckForBST tree = new CheckForBST();
        tree.insert(100);
        //tree.insert(2);
        //tree.insert(10);
        //tree.insert(110);
//        tree.print(tree.root);

       tree.root.left = new TreeNode(50);
       tree.root.right = new TreeNode(150);

        tree.root.left.left = new TreeNode(30);
        tree.root.left.right = new TreeNode(70);

        System.out.println(isBST(tree.root, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }

    private static boolean isBST(TreeNode root, int minValue, int maxValue) {
        if (root == null) {
            return true;
        }
        if (minValue <= root.data && maxValue >= root.data && isBST(root.left, minValue, root.data) && isBST(root.right, root.data, maxValue)) {
            return true;
        } else {
            return false;
        }

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
            lastInsertedNode.left = new TreeNode(data);
        } else {
            lastInsertedNode.right = new TreeNode(data);
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