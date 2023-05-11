package DataStructuresAndAlgorithmsInJava;

import java.util.NoSuchElementException;

/*
*
*
* Fields:

root: the root node of the BST
size: the number of nodes in the BST
Methods:

insert(value): inserts a new node with the given value into the BST while maintaining the BST property
search(value): returns a boolean indicating whether the node with the given value is present in the BST
delete(value): removes the node with the given value from the BST while maintaining the BST property
get_min(): returns the node with the smallest value in the BST
get_max(): returns the node with the largest value in the BST
traverse_inorder(): returns a list of the BST values in inorder traversal order (left subtree, node, right subtree)
traverse_preorder(): returns a list of the BST values in preorder traversal order (node, left subtree, right subtree)
traverse_postorder(): returns a list of the BST values in postorder traversal order (left subtree, right subtree, node)
is_empty(): returns a boolean indicating whether the BST is empty or not
clear(): removes all nodes from the BST
I hope this helps! Let me know if you have any further questions.
*
*
*
* */



public class BSTTest {

    TreeNode root;
    int size = 0;

    public static void main(String[] args) {
        BSTTest tree = new BSTTest();
        tree.add(10);
        tree.add(1);
        tree.add(2);
        tree.add(3);
        tree.add(4);
        tree.add(23);
        tree.add(21);
        tree.add(33);

        tree.print(tree.root);
        System.out.println();
        tree.deleteKey(10);
        tree.print(tree.root);
        System.out.println();
        System.out.println(tree.search(444));
        System.out.println(tree.getMin(tree.root));
        System.out.println(tree.getMax(tree.root));
    }

    private int getMax(TreeNode root) {
        if (root.right==null){
            return root.data;
        }
        return getMax(root.right);
    }

    private int getMin(TreeNode root) {
        if (root.left==null){
            return root.data;
        }
        return getMin(root.left);
    }

    private boolean search(int data) {
        return searchRec(root,data);
    }

    private boolean searchRec(TreeNode root, int data) {
        if(root!=null && root.data==data){
            return true;
        } else if (root==null) {
            return false;
        }
        if(data<root.data){
            return searchRec(root.left,data);
        }else{
            return searchRec(root.right,data);
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

    private void add(int data) {
        size++;
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
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    // This method mainly calls deleteRec()
    void deleteKey(int key) { root = deleteRec(root, key); }

    /* A recursive function to
      delete an existing key in BST
     */
   public TreeNode deleteRec(TreeNode root, int key)
    {
        /* Base Case: If the tree is empty */
        if (root == null)
            return root;

        /* Otherwise, recur down the tree */
        if (key < root.data)
            root.left = deleteRec(root.left, key);
        else if (key > root.data)
            root.right = deleteRec(root.right, key);

            // if key is same as root's
            // key, then This is the
            // node to be deleted
        else {
            // node with only one child or no child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // node with two children: Get the inorder
            // successor (smallest in the right subtree)
            root.data = getMin(root.right);

            // Delete the inorder successor
            root.right = deleteRec(root.right, root.data);
        }
        return root;
    }



}