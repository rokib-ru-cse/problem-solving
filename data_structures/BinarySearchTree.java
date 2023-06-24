/**
 * BinarySearchTree
 */
public class BinarySearchTree {
    private static TreeNode root;

    private static class TreeNode {
        private int data;
        private TreeNode left, right;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    public BinarySearchTree() {
        root = null;
    }

    private static TreeNode insert(TreeNode root, int data) {
        if (root == null) {
            TreeNode x = new TreeNode(data);
            return x;
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }

    private static void printTree(TreeNode root) {
        if (root == null) {
            return;
        }
        printTree(root.left);
        System.out.print(root.data + " ");
        printTree(root.right);
    }

    private static int searchNode(TreeNode root, int key) {
        if (root == null) {
            return 0;
        }
        if (root.data == key) {
            return root.data;
        }
        if(key<root.data){
            return searchNode(root.left, key);
        }else{
            return searchNode(root.right, key);
        }
    }

    public static void main(String[] args) {
        root = insert(root, 10);
        root = insert(root, 1);
        root = insert(root, 2);
        root = insert(root, 19);
        printTree(root);
        System.out.println();
        System.out.println(searchNode(root, 3));
    }
}