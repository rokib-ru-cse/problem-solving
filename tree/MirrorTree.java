package tree;

import java.util.LinkedList;
import java.util.Queue;

public class MirrorTree {

    TreeNode root;
    int size = 0;

    public static void main(String[] args) {
        MirrorTree tree = new MirrorTree();
        tree.insert(100);
        tree.insert(2);
        tree.insert(10);
        tree.insert(110);
        tree.print(tree.root);

        MirrorTree tree1 = new MirrorTree();
        tree1.insert(100);
        tree1.insert(2);
        tree1.insert(10);
        tree1.insert(110);
        tree.mirror(tree1.root);
        System.out.println();
        tree.print(tree1.root);

        System.out.println();
//        tree.print(tree.root);
        System.out.println(isMirror(tree.root, tree1.root));

    }

    private static boolean isMirror(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        return (root1.data == root2.data)
                && isMirror(root1.left, root2.right)
                && isMirror(root1.right, root2.left);
    }

    private void mirror(TreeNode root) {
        if (root == null) {
            return;
        }
        mirrorRec(root);
    }

    private TreeNode mirrorRec(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = mirrorRec(root.left);
        TreeNode right = mirrorRec(root.right);

        root.left = right;
        root.right = left;
        return root;
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
        TreeNode lastInsertedParentNode = lastInsertedParentNode();
        if (lastInsertedParentNode.left == null) {
            lastInsertedParentNode.left = new TreeNode(data);
        } else {
            lastInsertedParentNode.right = new TreeNode(data);
        }
    }

    private TreeNode lastInsertedParentNode() {
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
