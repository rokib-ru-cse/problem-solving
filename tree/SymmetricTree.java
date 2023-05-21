package tree;

import DataStructuresAndAlgorithmsInJava.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {
    TreeNode root;
    int size = 0;

    public static void main(String[] args) {
        SymmetricTree tree = new SymmetricTree();
        tree.insert(100);
        tree.insert(2);
        tree.insert(2);
        tree.insert(110);
        tree.insert(4);
        tree.insert(4);
        tree.insert(110);
        System.out.println(tree.isSymmetric());
    }

    private boolean isSymmetric() {
        return isSymmetricRec(root, root);
    }

    private boolean isSymmetricRec(TreeNode root, TreeNode root1) {
        if (root == null && root1 == null) {
            return true;
        }
        if (root != null && root1 != null
                && root.data == root1.data) {
            return (isSymmetricRec(root.left, root1.right) && isSymmetricRec(root.right, root1.left));
        }
        return false;
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
            lastInsertedNode.left  = new TreeNode(data);
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















