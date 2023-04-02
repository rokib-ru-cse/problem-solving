package linkedList;

public class Add1ToANumberRepresentedAsLinkedList {

    static Node Add1ToANumberRepresentedAsLinkedList(Node root){
        Node newRoot = root;
        backTrack(root,root.value,1);
        return newRoot;
    }

   static void backTrack(Node root,int currentNumber,int previousNumber){
        if(root==null){
            return ;
        }
        currentNumber = root.value;
        backTrack(root.next,currentNumber,previousNumber);
        root.value = (currentNumber+previousNumber)>9?(currentNumber+previousNumber)%10: currentNumber+previousNumber;
        if(currentNumber+previousNumber>9){
            previousNumber = 1;
        }
    }

    public static void main(String[] args) {
        Node one = new Node(1);
        Node two = new Node(9);
        Node three = new Node(9);
        Node four = new Node(9);
        Node a = new Node(9);
        Node b = new Node(9);
        Node c = new Node(9);
        Node d = new Node(9);
        Node e = new Node(9);
        Node f = new Node(9);
        Node g = new Node(9);

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = a;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;

        Node n = Add1ToANumberRepresentedAsLinkedList(one);
        while (n != null) {
            System.out.print(n.value + "->");
            n = n.next;
        }
    }
}
