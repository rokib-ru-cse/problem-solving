package tree;

import DataStructuresAndAlgorithmsInJava.TreeNode;

import java.util.LinkedList;
import java.util.Queue;


public class BinarySearchTreeLowestCommonAncestor {
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
        BinarySearchTreeLowestCommonAncestor tree = new BinarySearchTreeLowestCommonAncestor();
        tree.root = tree.insert(tree.root, 100);
        tree.root = tree.insert(tree.root, 2);
        tree.root = tree.insert(tree.root, 10);
        tree.root = tree.insert(tree.root, 110);
        tree.print(tree.root);
        System.out.println();
        System.out.println(lca(tree.root, 10, 110).getData());
    }


    public static TreeNode lca(TreeNode root, int v1, int v2) {
        // Write your code here.
        if (root == null ||root.getData()==v1 || root.getData()==v2) {
            return root;
        }
        TreeNode left = lca(root.getLeft(), v1, v2);
        TreeNode right = lca(root.getRight(), v1, v2);
        if (left==null){
            return right;
        }else if (right==null){
            return left;
        }else{
            return root;
        }
    }
    private void print(DataStructuresAndAlgorithmsInJava.TreeNode root) {
        if (root == null) {
            return;
        }
        print(root.getLeft());
        System.out.print(root.getData() + " ");
        print(root.getRight());
    }

    private void insert(int data) {
        if (root == null) {
            root = new DataStructuresAndAlgorithmsInJava.TreeNode(data);
            return;
        }
        DataStructuresAndAlgorithmsInJava.TreeNode lastInsertedNode = lastInsertedNode();
        if (lastInsertedNode.getLeft() == null) {
            lastInsertedNode.setLeft(new DataStructuresAndAlgorithmsInJava.TreeNode(data));
        } else {
            lastInsertedNode.setRight(new DataStructuresAndAlgorithmsInJava.TreeNode(data));
        }
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




