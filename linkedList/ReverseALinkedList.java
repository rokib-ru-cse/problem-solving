package linkedList;

public class ReverseALinkedList {

    static Node reverseALinkedList(Node root) {

        // Node* current = head;
        // Node *prev = NULL, *next = NULL;

        // while (current != NULL) {
        // // Store next
        // next = current->next;
        // // Reverse current node's pointer
        // current->next = prev;
        // // Move pointers one position ahead.
        // prev = current;
        // current = next;
        // }
        // head = prev;

        Node previousNode = null;
        Node currentNode = root;
        Node nextNode = null;
        while (currentNode != null) {
            nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;

        }
        return previousNode;
    }

    public static void main(String[] args) {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(4);
        Node four = new Node(6);

        one.next = two;
        two.next = three;
        three.next = four;

        Node n = reverseALinkedList(one);
        while (n != null) {
            if (n.next == null) {
                System.out.print(n.value);
            } else {
                System.out.print(n.value + "->");
            }
            n = n.next;
        }
        System.out.println();
    }
}
