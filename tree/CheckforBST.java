package tree;

import tree.TreeNode;

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
        if (root==null || (root.left==null&&root.right==null)){
            return true;
        }
        int p = root.data;
        int l = 0;
        int r = 0;
        if(root.left!=null){
            l = root.left.data;
        }
        if(root.right!=null){
            r = root.right.data;
        }
        if(l!=0 && r!=0){
            if(l<=p && r>=p && isBST(root.left)&&isBST(root.right)){
                return true;
            }
        }else if (l!=0){
            if(l<=p && isBST(root.left)&&isBST(root.right)){
                return true;
            }
        }
        else if (r!=0){
            if(r>=p && isBST(root.left)&&isBST(root.right)){
                return true;
            }
        }

        return false;
    }

    private void print(TreeNode root) {
        if (root==null){
            return;
        }
        print(root.left);
        System.out.print(root.data+" ");
        print(root.right);
    }

    private void insert(int data) {
        if(root==null){
            root = new TreeNode(data);
            return;
        }
        TreeNode lastInsertedNode = lastInsertedNode();
        if (lastInsertedNode.left==null){
            lastInsertedNode.left = (new TreeNode(data));
        }else{
            lastInsertedNode.right = (new TreeNode(data));
        }
    }

    private TreeNode lastInsertedNode() {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            TreeNode temp = q.poll();
            if(temp.left!=null&&temp.right!=null){
                q.add(temp.left);
                q.add(temp.right);
            }else{
                return temp;
            }
        }
        return null;
    }
}

