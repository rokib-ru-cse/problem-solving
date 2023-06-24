import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {

    private TreeNode root;

    public BinaryTree() {
        this.root = null;
    }

    private static class TreeNode {
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // public void insertIntoTree(int data) {
    // TreeNode newNode = new TreeNode(data);
    // if (root == null) {
    // root = newNode;
    // return;
    // }
    // lastNode(root, newNode);
    // }

    // public void lastNode(TreeNode root, TreeNode newNode) {
    // if (root == null) {
    // root = newNode;
    // return;
    // }
    // lastNode(root.left, newNode);
    // lastNode(root.right, newNode);
    // }

    public void preOrderTraverseRecursive(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrderTraverseRecursive(root.left);
        preOrderTraverseRecursive(root.right);
    }

    public void preOrderTraverseIterative(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            System.out.print(temp.data + " ");
            if (temp.right != null) {
                stack.push(temp.right);
            }
            if (temp.left != null) {
                stack.push(temp.left);
            }
        }
    }

    public void postOrderTraverseRecursive(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrderTraverseRecursive(root.left);
        postOrderTraverseRecursive(root.right);
        System.out.print(root.data + " ");
    }

    public void postOrderTraverseIterative(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            if (root.right != null) {
                stack.push(root.right);
            }
            if (root.left != null) {
                stack.push(root.left);
            }
            TreeNode temp = stack.pop();
            System.out.print(temp.data + " ");
        }
    }

    public void inOrderTraverseRecursive(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrderTraverseRecursive(root.left);
        System.out.print(root.data + " ");
        inOrderTraverseRecursive(root.right);
    }

    public void levelOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            if (temp.left != null) {
                queue.offer(temp.left);
            }
            if (temp.right != null) {
                queue.offer(temp.right);
            }
            System.out.print(temp.data + " ");
        }
    }
    public int maxValue(TreeNode root){
        if(root==null){
            return 0;
        }
        int max = Integer.MIN_VALUE;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
            if(temp.left!=null){
                queue.offer(temp.left);
            }
            if(temp.right!=null){
                queue.offer(temp.right);
            }
            if(temp.data>max){
                max = temp.data;
            }
        }
        return max;
    }

    public void createBinaryTree() {
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        TreeNode six = new TreeNode(6);
        root = one;
        one.left = two;
        one.right = three;
        two.left = four;
        two.right = five;
        three.left = six;
    }

    public static void main(String[] args) {
        BinaryTree obj = new BinaryTree();
        obj.createBinaryTree();
        System.out.print("preOrder Traverse Recursive = ");
        obj.preOrderTraverseRecursive(obj.root);
        System.out.println();
        System.out.print("preOrder Traverse Iterative = ");
        obj.preOrderTraverseIterative(obj.root);
        System.out.println();
        System.out.print("postOrder Traverse Recursive = ");
        obj.postOrderTraverseRecursive(obj.root);
        System.out.println();
        // obj.postOrderTraverseIterative(obj.root);
        // System.out.println();
        System.out.print("inOrder Traverse Recursive = ");
        obj.inOrderTraverseRecursive(obj.root);
        System.out.println();
        System.out.print("levelOrder Traverse = ");
        obj.levelOrderTraversal(obj.root);
        System.out.println();
        System.out.println("Maximum value in binary tree = "+obj.maxValue(obj.root));
    }
}
