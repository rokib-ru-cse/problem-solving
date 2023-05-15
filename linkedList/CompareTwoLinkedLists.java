package linkedList;

public class CompareTwoLinkedLists {
    static boolean compareLists(Node head1, Node head2) {

        if (head1 == null && head2 == null) {
            return true;
        } else if ((head1 != null && head2 == null) || (head1 == null && head2 != null)) {
            return false;
        } else {
            while (head1 != null && head2 != null) {
                if (head1.value!=head2.value){
                    return false;
                }
                head1 = head1.next;
                head2 = head2.next;
            }
            if (head1==null&&head2==null) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {

    }
}
