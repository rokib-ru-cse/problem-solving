package linkedList;

public class DeleteDuplicateValueNodesFromASortedLinkedList {

    public static Node removeDuplicates(Node llist) {
        // Write your code here
        if (llist==null){
            return null;
        }
        Node returnList = llist;
        while (llist!=null){
            if (llist.next!=null && llist.value==llist.next.value){
                llist.next = llist.next.next;
            }else{
                llist = llist.next;
            }
        }
        return returnList;
    }

    public static void main(String[] args) {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node three1 = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node five1 = new Node(5);

        one.next = two;
        two.next = three;
        three.next = three1;
        three1.next = four;
        four.next = five;
        five.next = five1;

        Node n = removeDuplicates(one);
        while (n != null) {
            System.out.print(n.value + "->");
            n = n.next;
        }
    }
}
