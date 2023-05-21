package striver_sde_sheet.BinaryTreepart_II;


import tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Checkiftwotreesareidenticalornot {
    TreeNode root;
    int size = 0;

    public static boolean isIdentical(TreeNode tree1,TreeNode tree2){
        if (tree1==null&&tree2==null) {
            return true;
        }
        if (tree1.data==tree2.data&&isIdentical(tree1.left,tree2.left)&&isIdentical(tree1.right,tree2.right)){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        Checkiftwotreesareidenticalornot tree1 = new Checkiftwotreesareidenticalornot();
        tree1.insert(100);
        tree1.insert(2);
        tree1.insert(10);
        tree1.insert(110);
        tree1.insert(12);

        Checkiftwotreesareidenticalornot tree2 = new Checkiftwotreesareidenticalornot();
        tree2.insert(100);
        tree2.insert(2);
        tree2.insert(10);
        tree2.insert(110);
        tree2.insert(11);
        if (isIdentical(tree1.root,tree2.root)){
            System.out.println("is identical");
        }else{
            System.out.println("is not identical");
        }
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
            lastInsertedNode.left = (new TreeNode(data));
        } else {
            lastInsertedNode.right = (new TreeNode(data));
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
