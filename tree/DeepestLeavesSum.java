package tree;

import java.util.LinkedList;
import java.util.Queue;


public class DeepestLeavesSum {
    TreeNode root;
    int size = 0;

    public static void main(String[] args) {
        DeepestLeavesSum tree = new DeepestLeavesSum();
        tree.insert(100);
        tree.insert(2);
        tree.insert(10);
        tree.insert(110);
        //tree.print(tree.root);
        System.out.println(deepestSum(tree.root));
    }

    private static int deepestSum(TreeNode root) {
        int height = height(root);
        Integer sum=0;
        return deepestSum(root, height, 0, sum);
    }

    private static int deepestSum(TreeNode root, int height, int level, int sum) {
        if (root == null) {
            return 0;
        }
        if (level == height) {
            sum = sum + root.data;
        }
        sum += deepestSum(root.left, height, level + 1, sum);
        sum += deepestSum(root.right, height, level + 1, sum);
        return sum;
    }

    private static int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(height(root.left), height(root.right)) + 1;
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
