package practice.tree;

import tree.TreeNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class ZigZagTreeTraversal {


    TreeNode root;

    private void ZigZagTreeTraversal1(TreeNode root) {
        if (root == null) {
            return;
        }
        Deque<TreeNode> deque = new LinkedList<>();
        deque.offer(root);
        boolean leftToRight = true;
        while (!deque.isEmpty()) {
            int size = deque.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = leftToRight ? deque.pollFirst() : deque.pollLast();
                System.out.print(node.data + " ");
                if (leftToRight) {
                    if (node.left != null) {
                        deque.addLast(node.left);
                    }
                    if (node.right != null) {
                        deque.addLast(node.right);
                    }
                } else {

                    if (node.left != null) {
                        deque.addFirst(node.left);
                    }
                    if (node.right != null) {
                        deque.addFirst(node.right);
                    }
                }
            }
            leftToRight = !leftToRight;
        }
        System.out.println();
    }

    private void ZigZagTreeTraversal2(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> currentLevel = new Stack<>();
        Stack<TreeNode> nextLevel = new Stack<>();
        boolean leftToRight = true;

        currentLevel.push(root);

        while (!currentLevel.isEmpty()) {
            TreeNode node = currentLevel.pop();
            System.out.print(node.data + " ");

            if (leftToRight) {
                if (node.left!=null){
                    nextLevel.push(node.left);
                }
                if (node.right!=null){
                    nextLevel.push(node.right);
                }
            }else{
                if (node.right!=null){
                    nextLevel.push(node.right);
                }
                if (node.left!=null){
                    nextLevel.push(node.left);
                }
            }
            if (currentLevel.isEmpty()){
                currentLevel = nextLevel;
                nextLevel = new Stack<>();
                leftToRight = !leftToRight;
            }

        }
        System.out.println();
    }

    public static void main(String[] args) {
        ZigZagTreeTraversal tree = new ZigZagTreeTraversal();
        tree.root = new TreeNode(10);

        tree.root.left = new TreeNode(5);
        tree.root.right = new TreeNode(15);

        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(6);

        tree.root.right.left = new TreeNode(11);
        tree.root.right.right = new TreeNode(20);
//        tree.print(tree.root);
        tree.ZigZagTreeTraversal1(tree.root);
        tree.ZigZagTreeTraversal2(tree.root);
        /*
         *           10
         *          /   \
         *         5     15
         *       /  \    /  \
         *      4    6  11   20
         *
         *
         * */
    }
}
