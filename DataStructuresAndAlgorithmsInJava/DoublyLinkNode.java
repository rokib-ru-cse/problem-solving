package DataStructuresAndAlgorithmsInJava;

public class DoublyLinkNode<T> {
    T data;
    DoublyLinkNode next;
    DoublyLinkNode previous;
    DoublyLinkNode(){}
    DoublyLinkNode(T data){
        this.data = data;
        next = null;
        previous = null;
    }
}
