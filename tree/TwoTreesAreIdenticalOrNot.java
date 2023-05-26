package tree;

import java.io.FilterOutputStream;

public class TwoTreesAreIdenticalOrNot {

    public static boolean isIndectical(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        return (root1.data == root2.data && isIndectical(root1.left, root2.left) && isIndectical(root1.right, root2.right));
    }


    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(25);
        TreeNode root2 = new TreeNode(25);

        TreeNode firstNode = new TreeNode(20);
        TreeNode secondNode = new TreeNode(36);
        TreeNode thirdNode = new TreeNode(10);

//        TreeNode fourthNode = new TreeNode(22);
//
//
//        TreeNode fivethNode = new TreeNode(30);
//        TreeNode sixthNode = new TreeNode(40);
//
//        TreeNode seventhNode = new TreeNode(5);
//        TreeNode eighthNode = new TreeNode(12);
//
//        TreeNode ninethNode = new TreeNode(28);
//
//        TreeNode tenthNode = new TreeNode(38);
//        TreeNode eleventhNode = new TreeNode(48);
//        TreeNode twelvethNode = new TreeNode(4);

        root1.left = firstNode;
        root1.right = secondNode;


        root2.left = firstNode;
        root2.right = secondNode;
//
//        firstNode.left = thirdNode;
//        firstNode.right = fourthNode;
//
//        secondNode.left = fivethNode;
//        secondNode.right = sixthNode;
//
//        thirdNode.left = seventhNode;
//        thirdNode.right = eighthNode;
//
//        fivethNode.left = ninethNode;
//        sixthNode.left = tenthNode;
//        sixthNode.right = eleventhNode;
//
//        seventhNode.left = twelvethNode;

        System.out.println(isIndectical(root1, root2));
    }
}
