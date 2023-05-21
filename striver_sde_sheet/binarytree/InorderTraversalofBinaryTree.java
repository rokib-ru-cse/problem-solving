package striver_sde_sheet.binarytree;


import tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InorderTraversalofBinaryTree {
    TreeNode root;
    int size = 0;

    public static void main(String[] args) {
        InorderTraversalofBinaryTree tree = new InorderTraversalofBinaryTree();
        tree.insert(100);
        tree.insert(2);
        tree.insert(10);
        tree.insert(110);
        tree.print(tree.root);
        System.out.println();
        tree.printLoop(tree.root);
        System.out.println();
        tree.inOrderTraversal(tree.root);
    }

    public void inOrderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode currentNode = root;
        while (!stack.isEmpty() || currentNode != null) {
           if (currentNode!=null){
               stack.add(currentNode);
               currentNode = currentNode.left;
           }else{
               TreeNode node = stack.pop();
               System.out.print(node.data+" ");
               currentNode = node.right;
           }
        }
    }

    //    public void inOrderTraversal(TreeNode root) {
//        Stack<TreeNode> stack = new Stack<>();
//        TreeNode curr = root;
//        while (!stack.empty() || curr != null) {
//            if (curr != null) {
//                stack.push(curr);
//                curr = curr.left;
//            } else {
//                curr = stack.pop();
//                System.out.print(curr.data + " ");
//                curr = curr.right;
//            }
//        }
//    }
    private void printLoop(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        while (current != null || stack.size() > 0) {

            while (current != null) {
                stack.add(current);
                current = current.left;
            }
            TreeNode node = stack.pop();
            System.out.print(node.data + " ");
            current = node.right;
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

