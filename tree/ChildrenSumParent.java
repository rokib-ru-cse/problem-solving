package tree;

import tree.TreeNode;

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
        if (root == null || (root.left == null && root.right == null)) {
            return true;
        } else {
            int p = root.data;
            int l = 0;
            int r = 0;
            if (root.left != null) {
                l = root.left.data;
            }
            if (root.right != null) {
                r = root.right.data;
            }
            boolean lx = equalSum(root.left);
            boolean rx = equalSum(root.right);
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









