package tree;

import tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class Largestvalueineachlevelofbinarytree {
    TreeNode root;
    int size = 0;

    public static void main(String[] args) {
        Largestvalueineachlevelofbinarytree tree = new Largestvalueineachlevelofbinarytree();
        tree.insert(100);
        tree.insert(2);
        tree.insert(10);
        tree.insert(110);
        //tree.print(tree.root);
        Vector<Integer> allLevelMax = tree.largestValuecs(tree.root);
        for (int s : allLevelMax
        ) {
            System.out.print(s + " ");
        }
    }

    private Vector<Integer> largestValuecs(TreeNode root) {
        Vector<Integer> res = new Vector<>();
        helpers(res, root, 0);
        return res;
    }

    private void helpers(Vector<Integer> res, TreeNode root, int level) {
        if (root == null)
            return;
        if (level == res.size()) {
            res.add(root.data);
        } else {
            res.set(level, Math.max(res.get(level), root.data));
//            res.set(d, Math.max(res.get(d), root.val));
        }
        helpers(res, root.left, level + 1);
        helpers(res, root.right, level + 1);
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

