package DataStructuresAndAlgorithmsInJava;

public class TreeNode {
    public int data;
    public int height;
    public TreeNode left;
    public TreeNode right;
    public TreeNode parent;

    TreeNode() {

    }

    public TreeNode(int data) {
        this.data = data;
        left = null;
        right = null;
        parent = null;
    }
}
