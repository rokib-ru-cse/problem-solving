package tree;

import DataStructuresAndAlgorithmsInJava.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class CheckforBST {
    TreeNode root;
    int size = 0;

    public static void main(String[] args) {
        CheckforBST tree = new CheckforBST();
        tree.insert(100);
        tree.insert(2);
        tree.insert(111);
        tree.insert(1);
        if(tree.isBST(tree.root)){
            System.out.println("is bst");
        }else{
            System.out.println("is not bst");
        }
    }

    private boolean isBST(TreeNode root) {
        if (root==null || (root.getLeft()==null&&root.getRight()==null)){
            return true;
        }
        int p = root.getData();
        int l = 0;
        int r = 0;
        if(root.getLeft()!=null){
            l = root.getLeft().getData();
        }
        if(root.getRight()!=null){
            r = root.getRight().getData();
        }
        if(l!=0 && r!=0){
            if(l<=p && r>=p && isBST(root.getLeft())&&isBST(root.getRight())){
                return true;
            }
        }else if (l!=0){
            if(l<=p && isBST(root.getLeft())&&isBST(root.getRight())){
                return true;
            }
        }
        else if (r!=0){
            if(r>=p && isBST(root.getLeft())&&isBST(root.getRight())){
                return true;
            }
        }

        return false;
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

