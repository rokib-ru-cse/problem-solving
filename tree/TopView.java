package tree;

import DataStructuresAndAlgorithmsInJava.TreeNode;

import java.util.LinkedList;
import java.util.Queue;


public class TopView {
    DataStructuresAndAlgorithmsInJava.TreeNode root;
    int size = 0;
    public static void topView(TreeNode root) {

        if (root==null){
            return;
        }
        System.out.print(root.getData() + " ");
        topView(root.getLeft());

    }
    public static void main(String[] args) {
        TopView tree = new TopView();
        tree.insert(100);
        tree.insert(2);
        tree.insert(10);
        tree.insert(110);
        //tree.print(tree.root);
        topView(tree.root);
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
