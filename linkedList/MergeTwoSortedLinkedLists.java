package linkedList;

public class MergeTwoSortedLinkedLists {
    Node head;

    MergeTwoSortedLinkedLists() {
        head = null;
    }

    static Node mergeLists(Node head1, Node head2) {

        if (head1 == null && head2 == null) {
            return null;
        }
        Node newList = new Node(-1);
        while (head1 != null && head2 != null) {
            if (head1.value < head2.value) {
                newList.next = new Node(head1.value);
                head1 = head1.next;
            } else {
                newList.next = new Node(head2.value);
                head2 = head2.next;
            }
        }
        if (head1 != null) {
            newList.next = head1;
        }
        if (head2 != null) {
            newList.next = head2;
        }
        return newList.next;
    }

    Node insert(Node head, int data) {
        if (head == null) {
            head = new Node(data);
            return head;
        }
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(data);
        return head;
    }

    public static void main(String[] args) {
        MergeTwoSortedLinkedLists list1 = new MergeTwoSortedLinkedLists();
        list1.head = list1.insert(list1.head, 1);
        list1.head = list1.insert(list1.head, 3);
        list1.head = list1.insert(list1.head, 5);
        list1.head = list1.insert(list1.head, 7);
        list1.head = list1.insert(list1.head, 9);

        MergeTwoSortedLinkedLists list2 = new MergeTwoSortedLinkedLists();
        list2.head = list2.insert(list2.head, 2);
        list2.head = list2.insert(list2.head, 4);
        list2.head = list2.insert(list2.head, 6);
        list2.head = list2.insert(list2.head, 8);
        list2.head = list2.insert(list2.head, 10);
        //printMerge(list1.head, list2.head);
        int a = 10;
        if (true) {
            a = 20;
        }
        System.out.println(a);


    }

    private static void printMerge(Node head1, Node head2) {
        Node newList = null;
        Node newListCurrent = null;
        if (head1 == null && head2 == null) {
            return;
        }
        if (head1 != null && head2 != null) {
            if (head1.value < head2.value) {
                newList = new Node(head1.value);
                newListCurrent = newList;
                head1 = head1.next;
            } else {
                newList = new Node(head2.value);
                newListCurrent = newList;
                head2 = head2.next;
            }
        }

        while (head1 != null && head2 != null) {
            if (head1.value < head2.value) {
                newListCurrent.next = new Node(head1.value);
                newListCurrent = newListCurrent.next;
                head1 = head1.next;
            } else {
                newListCurrent.next = new Node(head2.value);
                newListCurrent = newListCurrent.next;
                head2 = head2.next;
            }
        }
        if (head1 != null) {
            newListCurrent.next = head1;
        }
        if (head2 != null) {
            newListCurrent.next = head2;
        }
        Node x = newList;
        while (x != null) {
            System.out.print(x.value + " ");
            x = x.next;
        }
    }
}
