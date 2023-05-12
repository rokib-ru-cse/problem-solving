package tree;

import DataStructuresAndAlgorithmsInJava.TreeNode;
import linkedList.Node;

import java.util.*;

public class BinaryTreeInorderTraversal_LeetCode94 {
    TreeNode root;
    int size = 0;

    public static void main(String[] args) {
        BinaryTreeInorderTraversal_LeetCode94 tree = new BinaryTreeInorderTraversal_LeetCode94();
        tree.insert(100);
        tree.insert(2);
        tree.insert(10);
        tree.insert(110);
        tree.print(tree.root);
        System.out.println();
        for (int s:tree.inorderTraversal(tree.root)
             ) {
            System.out.print(s+" ");
        }
    }
    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<>();
        if (root==null){
            return res;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while (curr != null || stack.size()>0 ){

            while (curr!=null){
                stack.add(curr);
                curr = curr.getLeft();
            }
            curr  =stack.pop();
            res.add(curr.getData());
            curr = curr.getRight();
        }
        return res;
    }
    private void print(TreeNode root) {
        if (root==null){
            return;
        }
        print(root.getLeft());
        System.out.print(root.getData()+" ");
        print(root.getRight());
    }

    private void insert(int data) {
        if(root==null){
            root = new TreeNode(data);
            return;
        }
        TreeNode lastInsertedNode = lastInsertedNode();
        if (lastInsertedNode.getLeft()==null){
            lastInsertedNode.setLeft(new TreeNode(data));
        }else{
            lastInsertedNode.setRight(new TreeNode(data));
        }
    }

    private TreeNode lastInsertedNode() {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            TreeNode temp = q.poll();
            if(temp.getLeft()!=null&&temp.getRight()!=null){
                q.add(temp.getLeft());
                q.add(temp.getRight());
            }else{
                return temp;
            }
        }
        return null;
    }
}
