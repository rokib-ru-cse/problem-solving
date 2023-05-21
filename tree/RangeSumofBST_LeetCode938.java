package tree;

import tree.TreeNode;

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

//    public int rangeSumBST(TreeNode root, int low, int high) {
//        if (root == null) {
//            return 0;
//        }
//        int sum = 0;
//        if (root.data >= low && root.data <= high) {
//            sum += root.data;
//        }
//        if (root.data >= low) {
//            sum += rangeSumBST(root.left, low, high);
//        }
//        if (root.data <= high) {
//            sum += rangeSumBST(root.right, low, high);
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
        if (root.data >= low && root.data <= high) {
            sum += root.data;
        }
        if (root.data >= low) {
            sum = sumRec(root.left, low, high, sum);
        }
        if (root.data <= high) {
            sum = sumRec(root.right, low, high, sum);
        }
        return sum;
    }





}



