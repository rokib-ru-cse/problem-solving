package tree;

import DataStructuresAndAlgorithmsInJava.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class RangeSumofBST_LeetCode938 {
    TreeNode root;
    int size = 0;

    public static void main(String[] args) {
        RangeSumofBST_LeetCode938 tree = new RangeSumofBST_LeetCode938();
        tree.insert(100);
        tree.insert(2);
        tree.insert(10);
        tree.insert(110);
        System.out.println(tree.rangeSumBST(tree.root, 2, 100));
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

//    public int rangeSumBST(TreeNode root, int low, int high) {
//        if (root == null) {
//            return 0;
//        }
//        int sum = 0;
//        if (root.getData() >= low && root.getData() <= high) {
//            sum += root.getData();
//        }
//        if (root.getData() >= low) {
//            sum += rangeSumBST(root.getLeft(), low, high);
//        }
//        if (root.getData() <= high) {
//            sum += rangeSumBST(root.getRight(), low, high);
//        }
//        return sum;
//    }
public int rangeSumBST(TreeNode root, int low, int high) {
    return sumRec(root, low, high, 0);
}

    private int sumRec(TreeNode root, int low, int high, int sum) {
        if (root == null) {
            return sum;
        }
        if (root.getData() >= low && root.getData() <= high) {
            sum += root.getData();
        }
        if (root.getData() >= low) {
            sum = sumRec(root.getLeft(), low, high, sum);
        }
        if (root.getData() <= high) {
            sum = sumRec(root.getRight(), low, high, sum);
        }
        return sum;
    }





}



