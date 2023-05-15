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

    }
}
