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
                && root.getData() == root1.getData()) {
            return (isSymmetricRec(root.getLeft(), root1.getRight()) && isSymmetricRec(root.getRight(), root1.getLeft()));
        }
        return false;
    }

    private void print(TreeNode root) {
        if (root == null) {
            return;
        }
        print(root.getLeft());
        System.out.print(root.getData() + " ");
        print(root.getRight());
    }

    private void insert(int data) {
        if (root == null) {
            root = new TreeNode(data);
            return;
        }
        TreeNode lastInsertedNode = lastInsertedNode();
        if (lastInsertedNode.getLeft() == null) {
            lastInsertedNode.setLeft(new TreeNode(data));
        } else {
            lastInsertedNode.setRight(new TreeNode(data));
        }
    }

    private TreeNode lastInsertedNode() {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode temp = q.poll();
            if (temp.getLeft() != null && temp.getRight() != null) {
                q.add(temp.getLeft());
                q.add(temp.getRight());
            } else {
                return temp;
            }
        }
        return null;
    }
}















