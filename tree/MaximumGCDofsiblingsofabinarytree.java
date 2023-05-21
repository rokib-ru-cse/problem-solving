package tree;

import tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumGCDofsiblingsofabinarytree {
    TreeNode root;
    int size = 0;

    public static void main(String[] args) {
        MaximumGCDofsiblingsofabinarytree tree = new MaximumGCDofsiblingsofabinarytree();
        tree.insert(100);
        tree.insert(2);
        tree.insert(10);
        tree.insert(110);
        System.out.println(tree.maxGCD(tree.root));
        tree.print(tree.root);
    }

    private int maxGCD(TreeNode root) {
        return GCD(root.left.data,root.right.data);
    }

    private int GCD(int data, int data1) {
        if(data1==0){
            return data;
        }
        return GCD(data1,data%data1);
    }

    private void print(TreeNode root) {
        if (root==null){
            return;
        }
        print(root.left);
        System.out.print(root.data+" ");
        print(root.right);
    }

    private void insert(int data) {
        if(root==null){
            root = new TreeNode(data);
            return;
        }
        TreeNode lastInsertedNode = lastInsertedNode();
        if (lastInsertedNode.left==null){
            lastInsertedNode.left = (new TreeNode(data));
        }else{
            lastInsertedNode.right = (new TreeNode(data));
        }
    }

    private TreeNode lastInsertedNode() {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            TreeNode temp = q.poll();
            if(temp.left!=null&&temp.right!=null){
                q.add(temp.left);
                q.add(temp.right);
            }else{
                return temp;
            }
        }
        return null;
    }
}

