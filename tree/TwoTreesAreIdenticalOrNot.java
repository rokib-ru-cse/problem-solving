package tree;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TwoTreesAreIdenticalOrNot {
    TreeNode root;

    private static boolean isIdentical1(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        return (root1.data == root2.data)
                && isIdentical1(root1.left, root2.left)
                && isIdentical1(root1.right, root2.right);

    }

    private static boolean isIdentical2(TreeNode root1, TreeNode root2) {
        Queue<TreeNode> queue1 = new LinkedList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();

        queue1.offer(root1);
        queue2.offer(root2);
        while (!queue1.isEmpty() && !queue2.isEmpty()) {
            TreeNode node1 = queue1.poll();
            TreeNode node2 = queue2.poll();
            if (node1.data != node2.data) {
                return false;
            }
            if (node1.left != null) {
                queue1.offer(node1.left);
            }
            if (node1.right != null) {
                queue1.offer(node1.right);
            }
            if (node2.left != null) {
                queue2.offer(node2.left);
            }
            if (node2.right != null) {
                queue2.offer(node2.right);
            }
        }
        return queue1.isEmpty() && queue2.isEmpty();
    }

    private static boolean isIdentical3(TreeNode root1, TreeNode root2) {
        List<Integer> tree1Nodes = new ArrayList<>();
        List<Integer> tree2Nodes = new ArrayList<>();

        preorderTraversal(root1, tree1Nodes);
        preorderTraversal(root2, tree2Nodes);
        return tree1Nodes.equals(tree2Nodes);
    }

    private static void preorderTraversal(TreeNode root, List<Integer> treeNodes) {
        if (root == null) {
            return;
        }
        treeNodes.add(root.data);
        preorderTraversal(root.left, treeNodes);
        preorderTraversal(root.right, treeNodes);
    }

    public static void main(String[] args) {
        TwoTreesAreIdenticalOrNot tree1 = new TwoTreesAreIdenticalOrNot();
        tree1.root = new TreeNode(10);

        tree1.root.left = new TreeNode(5);
        tree1.root.right = new TreeNode(15);

        tree1.root.left.left = new TreeNode(4);
        tree1.root.left.right = new TreeNode(6);

        tree1.root.right.left = new TreeNode(11);
        tree1.root.right.right = new TreeNode(20);

        TwoTreesAreIdenticalOrNot tree2 = new TwoTreesAreIdenticalOrNot();
        tree2.root = new TreeNode(10);

        tree2.root.left = new TreeNode(5);
        tree2.root.right = new TreeNode(15);

        tree2.root.left.left = new TreeNode(4);
        tree2.root.left.right = new TreeNode(6);

        tree2.root.right.left = new TreeNode(11);
        tree2.root.right.right = new TreeNode(20);

        System.out.println(isIdentical1(tree1.root, tree2.root));
        System.out.println(isIdentical2(tree1.root, tree2.root));
        System.out.println(isIdentical3(tree1.root, tree2.root));

    }
}
