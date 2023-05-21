package tree;

public class TreeNode {
    public int data;
    public int height;
    public TreeNode left;
    public TreeNode right;

    TreeNode() {

    }

    public TreeNode(int data) {
        this.data = data;
        this.height = 1;
        left = null;
        right = null;
    }
}
