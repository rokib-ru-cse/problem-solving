package tree;

public class TreeNode {
    int data;
    TreeNode leftNode;
    TreeNode rightNode;
    TreeNode(){

    }
    TreeNode(int data){
       this.data =  data;
       leftNode = null;
       rightNode = null;
    }
    TreeNode(int data,TreeNode leftNode,TreeNode rightNode){
        this.data =  data;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
     }
}
