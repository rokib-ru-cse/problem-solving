package striver_sde_sheet.binarytree;


import DataStructuresAndAlgorithmsInJava.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PostorderTraversal {
    TreeNode root;
    int size = 0;

    public static void main(String[] args) {
        PostorderTraversal tree = new PostorderTraversal();
        tree.insert(100);
        tree.insert(2);
        tree.insert(10);
        tree.insert(110);
        tree.insert(11);
        tree.print(tree.root);
        System.out.println();
        tree.postOrder(tree.root);
    }

    private void postOrder(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode currentNode = root;
        while (!stack.isEmpty() || currentNode != null) {
            if (currentNode != null) {
                stack.add(currentNode);
                currentNode = currentNode.left;
            } else {
                TreeNode node = stack.peek().right;
                if (node == null) {
                    node = stack.pop();
                    System.out.print(node.data + " ");
                    while (!stack.isEmpty() && node == stack.peek().right) {
                        node = stack.pop();
                        System.out.print(node.data + " ");
                    }
                } else {
                    currentNode = node;
                }
            }
        }
    }

    private void print(TreeNode root) {
        if (root == null) {
            return;
        }
        print(root.left);
        print(root.right);
        System.out.print(root.data + " ");
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

