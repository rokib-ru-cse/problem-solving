package DSImplementation;

import com.sun.source.tree.Tree;

/**
 * BST
 */
public class BST {

    TreeNode root;

    public BST() {
        this.root = null;
    }

    public BST(int data) {
        root = new TreeNode(data);
    }

    public void insert(int data) {
        root = insertRec(root, data);
    }

    public TreeNode insertRec(TreeNode root, int data) {
        if (root == null) {
            root = new TreeNode(data);
            return root;
        }

        if (data <= root.data) {
            root.left = insertRec(root.left, data);
        } else {
            root.right = insertRec(root.right, data);
        }
        return root;
    }
    private static void inorderPrint(TreeNode root) {
        if(root==null){
            return;
        }
        inorderPrint(root.left);
        System.out.print(root.data+"->");
        inorderPrint(root.right);

    }
    public static void main(String[] args) {
        /*
        10
        /
       8
       /\
      7  9
         */

        BST tree = new BST();
        tree.insert(10);
        tree.insert(8);
        tree.insert(7);
        tree.insert(9);
        tree.insert(12);
        inorderPrint(tree.root);
        System.out.println();
    }


}