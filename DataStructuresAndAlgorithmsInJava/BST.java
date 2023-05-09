package DataStructuresAndAlgorithmsInJava;

public class BST {
    TreeNode root;

    public static void main(String[] args) {
        BST tree = new BST();
        tree.add(40);
        tree.add(30);
        tree.add(20);
        tree.add(50);
        tree.add(60);
        tree.add(55);
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

    private void add(int data) {
        if (root == null) {
            root = new TreeNode(data);
            return;
        }
        root = insertRec(root, data);
    }

    private TreeNode insertRec(TreeNode root, int data) {
        if (root == null) {
            return new TreeNode(data);
        }
        if (data <= root.data) {
            root.left = insertRec(root.left, data);
        } else {
            root.right = insertRec(root.right, data);
        }
        return root;
    }
}