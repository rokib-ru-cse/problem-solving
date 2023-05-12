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
            sum = sum + root.getData();
            return sum;
        }
        return sumofdepth(root.getLeft(),depth,level+1,sum)+sumofdepth(root.getRight(),depth,level+1,sum);
    }

    private int depth(TreeNode root) {
        if (root==null){
            return 0;
        }
        return Math.max(depth(root.getLeft()),depth(root.getRight()))+1;
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