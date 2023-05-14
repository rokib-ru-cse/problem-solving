package striver_sde_sheet.BinaryTreepart_II;

import DataStructuresAndAlgorithmsInJava.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class LCAinBinaryTree {
    TreeNode root;
    int size = 0;

    public static void main(String[] args) {
        LCAinBinaryTree tree = new LCAinBinaryTree();
        tree.insert(100);
        tree.insert(2);
        tree.insert(10);
        tree.insert(110);
        tree.insert(11);

        System.out.println(tree.LCA(tree.root, 110, 11).getData());
    }

    private TreeNode LCA(TreeNode root, int node1, int node2) {
        if (root == null || root.getData() == node1 || root.getData() == node2) {
            return root;
        }

        TreeNode left = LCA(root.getLeft(),node1,node2);
        TreeNode right = LCA(root.getRight(),node1,node2);
        if (left==null){
            return right;
        } else if (right==null) {
            return left;
        }else{
            return root;
        }
    }

//    private TreeNode LCA(TreeNode root, int node1, int node2) {
//        if (root == null || root.getData() == node1 || root.getData() == node2) {
//            return root;
//        }
//        TreeNode left = LCA(root.getLeft(), node1, node2);
//        TreeNode right = LCA(root.getRight(), node1, node2);
//        if (left == null) {
//            return right;
//        } else if (right == null) {
//            return left;
//        } else {
//            return root;
//        }
//    }

    private Queue<TreeNode> parentNodes(TreeNode node, int node1, Queue<TreeNode> parent) {
        if (node == null) {
            return parent;
        }
        if (node.getData() == node1) {
            parent.add(node);
            return parent;
        }
        parent = parentNodes(node.getLeft(), node1, parent);
        parent = parentNodes(node.getRight(), node1, parent);
        return parent;
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
