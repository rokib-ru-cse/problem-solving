package tree;

public class AVLTreeTest {

    TreeNode root;

    public static void main(String[] args) {

        AVLTreeTest tree = new AVLTreeTest();
        tree.root = tree.insert(tree.root, 10);
        tree.root = tree.insert(tree.root, 1);
        tree.root = tree.insert(tree.root, 1);
        tree.root = tree.insert(tree.root, 11);
        tree.root = tree.insert(tree.root, 12);
        tree.root = tree.insert(tree.root, 13);
        tree.root = tree.insert(tree.root, 15);
        tree.root = tree.insert(tree.root, 21);
        tree.root = tree.insert(tree.root, 33);
        tree.print(tree.root);
    }

    private void print(TreeNode root) {
        if (root==null){
            return;
        }
        print(root.left);
        System.out.print(root.data+" ");
        print(root.right);
    }

    private TreeNode insert(TreeNode root, int data) {
        if (root == null) {
            return new TreeNode(data);
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        root.height = Math.max(height(root.left), height(root.right)) + 1;
        int balance = balance(root);

        if (balance > 1 && data < root.left.data) {
            return rightRotation(root.left);
        }
        if (balance < -1 && data > root.right.data) {
            return leftRotation(root.right);
        }
        if (balance > 1 && data > root.left.data) {
            root.left = leftRotation(root.left);
            return rightRotation(root);
        }
        if (balance < -1 && data < root.right.data) {
            root.right = rightRotation(root.right);
            return leftRotation(root);
        }

        return root;
    }

    private TreeNode leftRotation(TreeNode root) {
        TreeNode rightNode = root.right;
        TreeNode leftNode = rightNode.left;

        rightNode.left = root;
        root.right = leftNode;

        root.height = Math.max(height(root.left), height(root.right)) + 1;
        rightNode.height = Math.max(height(rightNode.left), height(rightNode.right)) + 1;

        return rightNode;
    }

    private TreeNode rightRotation(TreeNode root) {
        TreeNode leftNode = root.left;
        TreeNode rightNode = leftNode .right;

        leftNode.right = root;
        root.left = rightNode;

        root.height = Math.max(height(root.left), height(root.right)) + 1;
        leftNode.height = Math.max(height(leftNode.left), height(leftNode.right)) + 1;
        return leftNode;
    }

    private int balance(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return height(root.left) - height(root.right);
    }

    private int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return root.height;
    }
}
