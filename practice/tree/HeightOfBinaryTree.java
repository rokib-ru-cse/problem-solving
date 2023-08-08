package practice.tree;

import tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class HeightOfBinaryTree {


    TreeNode root;
    int size = 0;

    public static void main(String[] args) {
        HeightOfBinaryTree tree = new HeightOfBinaryTree();
        tree.insert(100);
        tree.insert(2);
        tree.insert(10);
        tree.insert(110);
//        tree.print(tree.root);
        System.out.println(tree.heightOfBinaryTree(tree.root));
    }

    public int heightOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = heightOfBinaryTree(root.left);
        int rightHeight = heightOfBinaryTree(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
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
