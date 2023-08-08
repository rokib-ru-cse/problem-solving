package practice.tree;

import tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {

    TreeNode root;

    private boolean isSymmetric1() {
        if (root == null) {
            return true;
        }
        return isSymmetric1(root.left,root.right);
    }

    private boolean isSymmetric1(TreeNode left, TreeNode right) {
        if (left==null && right==null){
            return true;
        }
        if (left==null||right==null){
            return false;
        }
        return (left.data==right.data)
                && isSymmetric1(left.left,right.right)
                && isSymmetric1(left.right,right.left);
    }

    public static void main(String[] args) {
        SymmetricTree tree = new SymmetricTree();
        tree.insert(100);
        tree.insert(2);
        tree.insert(2);
        tree.insert(110);
        tree.insert(4);
        tree.insert(4);
        tree.insert(110);
        System.out.println(tree.isSymmetric1());
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
