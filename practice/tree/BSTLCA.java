package practice.tree;

import tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;


public class BSTLCA {
    TreeNode root;
    int size = 0;

    public static void main(String[] args) {
        BSTLCA tree = new BSTLCA();
        tree.insert(100);
        tree.insert(2);
        tree.insert(10);
        tree.insert(110);
        //tree.print(tree.root);

        System.out.println(lca(tree.root, 2, 10).data);
    }

    public static TreeNode lca(TreeNode root, int data1, int data2) {

        if (root == null || root.data == data1 || root.data == data2) {
            return root;
        }
        TreeNode left = lca(root.left, data1, data2);
        TreeNode right = lca(root.right, data1, data2);

        if (left == null) {
            return right;
        } else if (right == null) {
            return left;
        } else {
            return root;
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
