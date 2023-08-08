package tree;


class AVLNode {
    int key;
    int count; // Counter for duplicate occurrences
    int height;
    AVLNode left;
    AVLNode right;

    AVLNode(int key) {
        this.key = key;
        this.count = 1;
        this.height = 1;
    }
}

public class AVLTreeChatGPT {
    private AVLNode root;

    public void insert(int key) {
        root = insert(root, key);
    }

    private AVLNode insert(AVLNode node, int key) {
        if (node == null) {
            return new AVLNode(key);
        }

        if (key < node.key) {
            node.left = insert(node.left, key);
        } else if (key > node.key) {
            node.right = insert(node.right, key);
        } else {
            // Duplicate keys: Increment the count and return the node
            node.count++;
            return node;
        }

        node.height = 1 + Math.max(height(node.left), height(node.right));
        int balance = getBalance(node);

        // Left-Left Case
        if (balance > 1 && key < node.left.key) {
            return rightRotate(node);
        }

        // Right-Right Case
        if (balance < -1 && key > node.right.key) {
            return leftRotate(node);
        }

        // Left-Right Case
        if (balance > 1 && key > node.left.key) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // Right-Left Case
        if (balance < -1 && key < node.right.key) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    public void delete(int key) {
        root = delete(root, key);
    }

    private AVLNode delete(AVLNode node, int key) {
        if (node == null) {
            return null;
        }

        if (key < node.key) {
            node.left = delete(node.left, key);
        } else if (key > node.key) {
            node.right = delete(node.right, key);
        } else {
            if (node.count > 1) {
                // Duplicate node: Decrement the count
                node.count--;
            } else {
                // Regular deletion for a single occurrence or no occurrences left
                if (node.left == null || node.right == null) {
                    AVLNode temp = (node.left != null) ? node.left : node.right;

                    if (temp == null) {
                        temp = node;
                        node = null;
                    } else {
                        node = temp;
                    }
                } else {
                    AVLNode temp = findMin(node.right);
                    node.key = temp.key;
                    node.count = temp.count; // Move the count from the replacement node
                    node.right = delete(node.right, temp.key);
                }
            }
        }

        if (node == null) {
            return null;
        }

        node.height = 1 + Math.max(height(node.left), height(node.right));
        int balance = getBalance(node);

        // Left-Left Case
        if (balance > 1 && getBalance(node.left) >= 0) {
            return rightRotate(node);
        }

        // Left-Right Case
        if (balance > 1 && getBalance(node.left) < 0) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // Right-Right Case
        if (balance < -1 && getBalance(node.right) <= 0) {
            return leftRotate(node);
        }

        // Right-Left Case
        if (balance < -1 && getBalance(node.right) > 0) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }


    public boolean search(int key) {
        return search(root, key);
    }

    private boolean search(AVLNode node, int key) {
        if (node == null) {
            return false;
        }

        if (key == node.key) {
            return true;
        } else if (key < node.key) {
            return search(node.left, key);
        } else {
            return search(node.right, key);
        }
    }


    private AVLNode leftRotate(AVLNode node) {
        AVLNode rightNode = node.right;
        AVLNode rightLeftNode = rightNode.left;

        rightNode.left = node;
        node.right = rightLeftNode;

        node.height = 1 + Math.max(height(node.left), height(node.right));
        rightNode.height = 1 + Math.max(height(rightNode.left), height(rightNode.right));

        return rightNode;
    }

    private AVLNode rightRotate1(AVLNode y) {
        AVLNode x = y.left;
        AVLNode T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = 1 + Math.max(height(y.left), height(y.right));
        x.height = 1 + Math.max(height(x.left), height(x.right));

        return x;
    }

    private AVLNode rightRotate(AVLNode node) {
        AVLNode left = node.left;
        AVLNode leftRightNode = left.right;

        left.right = node;
        node.left = leftRightNode;

        node.height = 1 + Math.max(height(node.left), height(node.right));
        left.height = 1 + Math.max(height(left.left), height(left.right));

        return left;
    }

    private int height(AVLNode node) {
        if (node == null) {
            return 0;
        }
        return node.height;
    }

    private int getBalance(AVLNode node) {
        if (node == null) {
            return 0;
        }
        return height(node.left) - height(node.right);
    }

    private AVLNode findMin(AVLNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    public void print() {
        print(root);
    }

    private void print(AVLNode node) {
        if (node != null) {
            print(node.left);
            System.out.print(node.key + " ");
            print(node.right);
        }
    }

    public static void main(String[] args) {
        AVLTreeChatGPT tree = new AVLTreeChatGPT();
        tree.insert(10);
        tree.insert(1);
        tree.insert(1);
        tree.insert(11);
        tree.insert(12);
        tree.insert(13);
        tree.insert(15);
        tree.insert(21);
        tree.insert(33);
        tree.print(); // Output: 1 10 11 12 13 15 21 33
    }
}

