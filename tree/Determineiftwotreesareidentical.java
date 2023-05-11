package tree;


import DataStructuresAndAlgorithmsInJava.TreeNode;

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
        return root.getData() == root1.getData() && identical(root.getLeft(), root1.getLeft()) && identical(root.getRight(), root1.getRight());
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



