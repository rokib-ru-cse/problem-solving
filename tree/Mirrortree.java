package tree;

import tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Mirrortree {
    TreeNode root;
    int size = 0;

    public static void main(String[] args) {
        Mirrortree tree = new Mirrortree();
        tree.insert(100);
        tree.insert(2);
        tree.insert(10);
        tree.insert(110);
        tree.print(tree.root);

        tree.mirror(tree.root);
        System.out.println();
        tree.print(tree.root);

    }

    private void mirror(TreeNode root) {
        root = mirrorRec(root);
    }

    private TreeNode mirrorRec(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode left = mirrorRec(root.left);
        TreeNode right = mirrorRec(root.right);
        root.left = right;
        root.right = left;
        return root;
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





