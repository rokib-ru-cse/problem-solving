package tree;

import DataStructuresAndAlgorithmsInJava.TreeNode;

import java.util.LinkedList;
import java.util.Queue;


public class BinarySearchTreeInsertion {
    DataStructuresAndAlgorithmsInJava.TreeNode root;
    int size = 0;

    public static TreeNode insert(TreeNode root, int data) {
        if (root == null) {
            root = new TreeNode(data);
            return root;
        }
        return insertRec(root, data);

    }

    private static TreeNode insertRec(TreeNode root, int data) {
        if (root == null) {
            return new TreeNode(data);
        }
        if (data < root.getData()) {
            root.setLeft(insertRec(root.getLeft(), data));
        } else {
            root.setRight(insertRec(root.getRight(), data));
        }
        return root;
    }

    public static void main(String[] args) {
        BinarySearchTreeInsertion tree = new BinarySearchTreeInsertion();
        tree.insert(tree.root, 100);
        tree.insert(tree.root, 2);
        tree.insert(tree.root, 10);
        tree.insert(tree.root, 110);
        tree.print(tree.root);
    }

    private void print(DataStructuresAndAlgorithmsInJava.TreeNode root) {
        if (root == null) {
            return;
        }
        print(root.getLeft());
        System.out.print(root.getData() + " ");
        print(root.getRight());
    }


    private DataStructuresAndAlgorithmsInJava.TreeNode lastInsertedNode() {
        Queue<DataStructuresAndAlgorithmsInJava.TreeNode> q = new LinkedList<>();
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
