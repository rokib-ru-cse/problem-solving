package tree;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumGCDofsiblingsofabinarytree {
    TreeNode root;
    int size = 0;

    public static void main(String[] args) {
        MaximumGCDofsiblingsofabinarytree tree = new MaximumGCDofsiblingsofabinarytree();
        tree.insert(100);
        tree.insert(2);
        tree.insert(10);
        tree.insert(110);
        System.out.println(tree.maxGCD(tree.root, Integer.MIN_VALUE));
        // tree.print(tree.root);
    }

    private int maxGCD(TreeNode root, int maxgcd) {
        if (root == null) {
            return 0;
        }

        if (root.left != null && root.right != null) {
            maxgcd = Math.max(GCD(root.left.data, root.right.data), maxgcd);
        }
       else if (root.left != null) {
            maxgcd = Math.max(root.left.data, maxgcd);
        }
       else if (root.right != null) {
            maxgcd = Math.max(root.right.data, maxgcd);
        }else{
           maxgcd = root.data;
        }

       maxgcd =  Math.max(maxGCD(root.left,maxgcd), maxGCD(root.right,maxgcd));
        return maxgcd;
    }

    private int GCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return GCD(b, a % b);
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

