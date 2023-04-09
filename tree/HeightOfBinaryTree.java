package tree;

public class HeightOfBinaryTree {
    
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


        root.leftNode = firstNode;
        root.rightNode = secondNode;

        firstNode.leftNode = thirdNode;
        firstNode.rightNode = fourthNode;

        secondNode.leftNode = fivethNode;
        secondNode.rightNode = sixthNode;

        thirdNode.leftNode = seventhNode;
        thirdNode.rightNode = eighthNode;

        firstNode.leftNode = ninethNode;
        sixthNode.leftNode = tenthNode;
        sixthNode.rightNode = eleventhNode;
    }
}
