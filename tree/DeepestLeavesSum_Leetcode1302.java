package tree;

import DataStructuresAndAlgorithmsInJava.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class DeepestLeavesSum_Leetcode1302 {
    TreeNode root;
    int size = 0;

    public int deepestLeavesSum(TreeNode root) {
       int depth = depth(root);
       return sumofdepth(root,depth,1,0);
    }

    private int sumofdepth(TreeNode root, int depth, int level, int sum) {
        if (root==null){
            return 0;
        }
        if (depth==level){
            sum = sum + root.data;
            return sum;
        }
        return sumofdepth(root.left,depth,level+1,sum)+sumofdepth(root.right,depth,level+1,sum);
    }

    private int depth(TreeNode root) {
        if (root==null){
            return 0;
        }
        return Math.max(depth(root.left),depth(root.right))+1;
    }

    public static void main(String[] args) {
        DeepestLeavesSum_Leetcode1302 tree = new DeepestLeavesSum_Leetcode1302();
        tree.insert(100);
        tree.insert(2);
        tree.insert(10);
        tree.insert(110);
        System.out.println(tree.deepestLeavesSum(tree.root));
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