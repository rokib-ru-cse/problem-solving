package tree;

public class BST {

    TreeNode root;

    public static void main(String[] args) {
        BST tree = new BST();
        tree.root = insert(tree.root, 34);
        tree.root = insert(tree.root, 43);
        tree.root = insert(tree.root, 11);
        tree.root = insert(tree.root, 22);
        tree.root = insert(tree.root, 44);
        tree.root = insert(tree.root, 30);
        tree.root = insert(tree.root, 10);
        tree.root = remove(tree.root, 11);
        print(tree.root);
    }

    private static TreeNode remove(TreeNode root, int data) {
        if (root == null) {
            return root;
        }
        if (data < root.data) {
            root.left = remove(root.left, data);
        } else if (data > root.data) {
            root.right = remove(root.right, data);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            root.data = getMin(root.right);
            root.right = remove(root.right, root.data);
        }
        return root;
    }

    private static int getMin(TreeNode node) {
        if (node.left == null) {
            return node.data;
        }
        return getMin(node.left);
    }

    private static void print(TreeNode root) {
        if (root == null) {
            return;
        }
        print(root.left);
        System.out.print(root.data + " ");
        print(root.right);
    }

    private static TreeNode insert(TreeNode root, int data) {
        if (root == null) {
            return new TreeNode(data);
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }
}
