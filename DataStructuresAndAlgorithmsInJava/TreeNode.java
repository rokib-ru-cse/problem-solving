package DataStructuresAndAlgorithmsInJava;

public class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode parent;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    TreeNode() {

    }

    public TreeNode(int data) {
        this.data = data;
        left = null;
        right = null;
        parent = null;
    }
}
