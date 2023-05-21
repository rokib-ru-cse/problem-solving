package tree;

import DataStructuresAndAlgorithmsInJava.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class InorderTraversal {


    public static void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }


    TreeNode root;
    int size = 0;

    public static void main(String[] args) {
        InorderTraversal tree = new InorderTraversal();
        tree.insert(100);
        tree.insert(2);
        tree.insert(10);
        tree.insert(110);
        tree.print(tree.root);
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
            lastInsertedNode.left = new DataStructuresAndAlgorithmsInJava.TreeNode(data);
        } else {
            lastInsertedNode.right = new DataStructuresAndAlgorithmsInJava.TreeNode(data);
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