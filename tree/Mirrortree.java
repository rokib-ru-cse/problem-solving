package tree;

import DataStructuresAndAlgorithmsInJava.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Mirrortree {
    TreeNode root;
    int size = 0;

    public static void main(String[] args) {
        Mirrortree tree = new Mirrortree();
        tree.insert(100);
        tree.insert(2);
        tree.insert(10);
        tree.insert(110);
        tree.print(tree.root);
        
       tree.mirror(tree.root);
        System.out.println();
        tree.print(tree.root);

    }

    private void mirror(TreeNode root) {
        root =  mirrorRec(root);
    }

    private TreeNode mirrorRec(TreeNode root) {
        if (root==null){
            return root;
        }
        TreeNode left = mirrorRec(root.getLeft());
        TreeNode right = mirrorRec(root.getRight());
        root.setLeft(right);
        root.setRight(left);
        return root;
    }

    private void print(TreeNode root) {
        if (root==null){
            return;
        }
        print(root.getLeft());
        System.out.print(root.getData()+" ");
        print(root.getRight());
    }

    private void insert(int data) {
        if(root==null){
            root = new TreeNode(data);
            return;
        }
        TreeNode lastInsertedNode = lastInsertedNode();
        if (lastInsertedNode.getLeft()==null){
            lastInsertedNode.setLeft(new TreeNode(data));
        }else{
            lastInsertedNode.setRight(new TreeNode(data));
        }
    }

    private TreeNode lastInsertedNode() {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            TreeNode temp = q.poll();
            if(temp.getLeft()!=null&&temp.getRight()!=null){
                q.add(temp.getLeft());
                q.add(temp.getRight());
            }else{
                return temp;
            }
        }
        return null;
    }
}





