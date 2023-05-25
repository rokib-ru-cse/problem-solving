package tree;

import tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class CheckforBST {
    TreeNode root;
    int size = 0;

    public static void main(String[] args) {
        CheckforBST tree = new CheckforBST();
        tree.insert(100);
        tree.insert(2);
        tree.insert(111);
        tree.insert(1);
//        tree.insert(221);
        if (tree.isBST(tree.root)) {
            System.out.println("is bst");
        } else {
            System.out.println("is not bst");
        }
    }

    private boolean isBST(TreeNode root) {
        return isBST(root, null, null);
    }

    private boolean isBST(TreeNode root, Integer max, Integer min) {
        if (root == null) {
            return true;
        }

        if (max != null && root.data > max) {
            return false;
        }
        if (min != null && root.data < min) {
            return false;
        }
        return isBST(root.left, root.data, min) &&
                isBST(root.right, max, root.data);
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

