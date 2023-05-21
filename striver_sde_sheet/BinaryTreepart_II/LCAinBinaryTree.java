package striver_sde_sheet.BinaryTreepart_II;

import tree.TreeNode;

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

        System.out.println(tree.LCA(tree.root, 110, 11).data);
    }

    private TreeNode LCA(TreeNode root, int node1, int node2) {
        if (root == null || root.data == node1 || root.data == node2) {
            return root;
        }

        TreeNode left = LCA(root.left,node1,node2);
        TreeNode right = LCA(root.right,node1,node2);
        if (left==null){
            return right;
        } else if (right==null) {
            return left;
        }else{
            return root;
        }
    }

//    private TreeNode LCA(TreeNode root, int node1, int node2) {
//        if (root == null || root.data == node1 || root.data == node2) {
//            return root;
//        }
//        TreeNode left = LCA(root.left, node1, node2);
//        TreeNode right = LCA(root.right, node1, node2);
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
        if (node.data == node1) {
            parent.add(node);
            return parent;
        }
        parent = parentNodes(node.left, node1, parent);
        parent = parentNodes(node.right, node1, parent);
        return parent;
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
