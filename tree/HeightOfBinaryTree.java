package tree;

public class HeightOfBinaryTree {


    public static int maxDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftMax = maxDepth(root.leftNode);
        int rightMax = maxDepth(root.rightNode);
        if(leftMax>rightMax){
            return leftMax+1;
        }else{
            return rightMax+1;
        }
    }

    public static int maxDepthLoop(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftMax = maxDepth(root.leftNode);
        int rightMax = maxDepth(root.rightNode);
        if(leftMax>rightMax){
            return leftMax+1;
        }else{
            return rightMax+1;
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(25);
        TreeNode firstNode = new TreeNode(20);
        TreeNode secondNode = new TreeNode(36);

        TreeNode thirdNode = new TreeNode(10);
        TreeNode fourthNode = new TreeNode(22);


        TreeNode fivethNode = new TreeNode(30);
        TreeNode sixthNode = new TreeNode(40);

        TreeNode seventhNode = new TreeNode(5);
        TreeNode eighthNode = new TreeNode(12);

        TreeNode ninethNode = new TreeNode(28);

        TreeNode tenthNode = new TreeNode(38);
        TreeNode eleventhNode = new TreeNode(48);
        TreeNode twelvethNode = new TreeNode(4);

        root.leftNode = firstNode;
        root.rightNode = secondNode;

        firstNode.leftNode = thirdNode;
        firstNode.rightNode = fourthNode;

        secondNode.leftNode = fivethNode;
        secondNode.rightNode = sixthNode;

        thirdNode.leftNode = seventhNode;
        thirdNode.rightNode = eighthNode;

        fivethNode.leftNode = ninethNode;
        sixthNode.leftNode = tenthNode;
        sixthNode.rightNode = eleventhNode;

        seventhNode.leftNode = twelvethNode;

        System.out.println(maxDepth(root));
    }
}
