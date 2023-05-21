package tree;

import DataStructuresAndAlgorithmsInJava.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Diameteroftree {
    TreeNode root;
    int size = 0;

    public static void main(String[] args) {
        Diameteroftree tree = new Diameteroftree();
        tree.insert(100);
        tree.insert(2);
        tree.insert(10);
        tree.insert(110);
        System.out.println(tree.diameter());
    }

    private int diameter() {
        int leftTree = subTree(root.left);
        int rightTree = subTree(root.right);
        return leftTree + rightTree + 1;
    }

    private int subTree(TreeNode left) {
        if (left == null) {
            return 0;
        }
        int l = subTree(left.left);
        int r = subTree(left.right);
        return Math.max(l, r) + 1;
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
            lastInsertedNode.left = (new TreeNode(data));
        } else {
            lastInsertedNode.right = (new TreeNode(data));
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











