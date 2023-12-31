package practice.tree;

import tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class DiameterOfBinaryTree {
    TreeNode root;
    int size = 0;

  static   int diameter = 0;

    public int diameterOfBinaryTree2(TreeNode root) {
        // o(n*n)
        if (root == null) {
            return 0;
        }
        int leftHeight = diameterOfBinaryTree2(root.left);
        int rightHeight = diameterOfBinaryTree2(root.right);
        diameter = Math.max(diameter, leftHeight + rightHeight + 1);
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public int diameterOfBinaryTree1(TreeNode root) {
        // o(n*n)
        if (root == null) {
            return 0;
        }
        int leftTreeHeight = heightOfBinaryTree(root.left);
        int rightTreeHeight = heightOfBinaryTree(root.right);
        int leftDiameter = diameterOfBinaryTree1(root.left);
        int rightDiameter = diameterOfBinaryTree1(root.right);
        int current = leftTreeHeight + rightTreeHeight + 1;
//        return Math.max(leftTreeHeight + rightTreeHeight, Math.max(leftDiameter, rightDiameter));
        return Math.max(current, Math.max(leftDiameter, rightDiameter));
    }

    public int heightOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = heightOfBinaryTree(root.left);
        int rightHeight = heightOfBinaryTree(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        DiameterOfBinaryTree tree = new DiameterOfBinaryTree();
        tree.insert(100);
        tree.insert(2);
        tree.insert(10);
        tree.insert(110);
//        tree.print(tree.root);
        System.out.println(tree.diameterOfBinaryTree1(tree.root));
        tree.diameterOfBinaryTree2(tree.root);
        System.out.println(diameter);
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
