package DSImplementation;

public class BSTTest {

    TreeNode root;

    BSTTest() {
        root = null;
    }


    public static void main(String[] args) {
        BSTTest tree = new BSTTest();
        tree.insert(10);
        tree.insert(4);
        tree.insert(8);
        tree.insert(11);
        tree.insert(2);
        tree.insert(45);
        tree.insert(30);
        tree.inorderPrint(tree.root);
        System.out.println();
        System.out.println(tree.search(19));
        tree.delete(4);
        tree.inorderPrint(tree.root);
    }

    private TreeNode deleteRec(TreeNode node,int data){

        if(node==null){
            return node;
        }
        if(node.left!=null){
            return deleteRec(node,data);
        }else{
            return deleteRec(node,data);
        }
    }

    void delete(int key) { root = deleteRec(root, key); }
    private int search(int data) {
        return searchRec(root, data) == true ? data : -1;
    }

    private boolean searchRec(TreeNode root, int data) {
        if (root == null) {
            return false;
        }
        if ( root.data == data) {
            return true;
        }
        if (data < root.data) {
            return searchRec(root.left, data);
        } else {
            return searchRec(root.right, data);
        }
    }

    private static void inorderPrint(TreeNode root) {
        if (root == null) {
            return;
        }
        inorderPrint(root.left);
        System.out.print(root.data + "->");
        inorderPrint(root.right);

    }

    public void insert(int data) {
        root = insertRec(root, data);
    }


    public TreeNode insertRec(TreeNode root, int data) {
        if (root == null) {
            root = new TreeNode(data);
            return root;
        }

        if (data <= root.data) {
            root.left = insertRec(root.left, data);
        } else {
            root.right = insertRec(root.right, data);
        }
        return root;
    }
}