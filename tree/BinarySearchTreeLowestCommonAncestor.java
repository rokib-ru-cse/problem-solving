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
        if (data < root.data) {
            root.left = (insertRec(root.left, data));
        } else {
            root.right = (insertRec(root.right, data));
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
        System.out.println(lca(tree.root, 10, 110).data);
    }


    public static TreeNode lca(TreeNode root, int v1, int v2) {
        // Write your code here.
        if (root == null ||root.data==v1 || root.data==v2) {
            return root;
        }
        TreeNode left = lca(root.left, v1, v2);
        TreeNode right = lca(root.right, v1, v2);
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
        print(root.left);
        System.out.print(root.data + " ");
        print(root.right);
    }

    private void insert(int data) {
        if (root == null) {
            root = new DataStructuresAndAlgorithmsInJava.TreeNode(data);
            return;
        }
        DataStructuresAndAlgorithmsInJava.TreeNode lastInsertedNode = lastInsertedNode();
        if (lastInsertedNode.left == null) {
            lastInsertedNode.left = (new DataStructuresAndAlgorithmsInJava.TreeNode(data));
        } else {
            lastInsertedNode.right = (new DataStructuresAndAlgorithmsInJava.TreeNode(data));
        }
    }

    private DataStructuresAndAlgorithmsInJava.TreeNode lastInsertedNode() {
        Queue<DataStructuresAndAlgorithmsInJava.TreeNode> q = new LinkedList<>();
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




