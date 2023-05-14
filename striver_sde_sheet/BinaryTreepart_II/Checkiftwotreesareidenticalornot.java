package striver_sde_sheet.BinaryTreepart_II;


import DataStructuresAndAlgorithmsInJava.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Checkiftwotreesareidenticalornot {
    TreeNode root;
    int size = 0;

    public static boolean isIdentical(TreeNode tree1,TreeNode tree2){
        if (tree1==null&&tree2==null) {
            return true;
        }
        if (tree1.getData()==tree2.getData()&&isIdentical(tree1.getLeft(),tree2.getLeft())&&isIdentical(tree1.getRight(),tree2.getRight())){
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
