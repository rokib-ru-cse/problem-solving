package tree;


import tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Determineiftwotreesareidentical {
    TreeNode root;
    int size = 0;

    public static void main(String[] args) {
        Determineiftwotreesareidentical tree = new Determineiftwotreesareidentical();
        tree.insert(100);
        tree.insert(2);
        tree.insert(10);
        tree.insert(110);

        Determineiftwotreesareidentical tree2 = new Determineiftwotreesareidentical();
        tree2.insert(100);
        tree2.insert(2);
        tree2.insert(10);
        tree2.insert(110);
        System.out.println(tree.identical(tree.root, tree2.root));
    }

    private boolean identical(TreeNode root, TreeNode root1) {
        if (root == null && root1 == null) {
            return true;
        }
        return root.data == root1.data && identical(root.left, root1.left) && identical(root.right, root1.right);
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



