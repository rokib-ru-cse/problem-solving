package tree;

import DataStructuresAndAlgorithmsInJava.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class ChildrenSumParent {
    TreeNode root;
    int size = 0;

    public static void main(String[] args) {
        ChildrenSumParent tree = new ChildrenSumParent();
        tree.insert(100);
        tree.insert(2);
        tree.insert(98);
        tree.insert(2);
        if (tree.equalSum(tree.root)) {
            System.out.println("all nodes child sum are equal to its parent");
        } else {
            System.out.println("all nodes child sum are not equal to its parent");
        }
    }

    private boolean equalSum(TreeNode root) {
        if (root == null || (root.getLeft() == null && root.getRight() == null)) {
            return true;
        } else {
            int p = root.getData();
            int l = 0;
            int r = 0;
            if (root.getLeft() != null) {
                l = root.getLeft().getData();
            }
            if (root.getRight() != null) {
                r = root.getRight().getData();
            }
            boolean lx = equalSum(root.getLeft());
            boolean rx = equalSum(root.getRight());
            if (p == (l + r) && lx && rx) {
                return true;
            } else {
                return false;
            }
        }
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









