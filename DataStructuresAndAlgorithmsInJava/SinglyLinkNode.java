package DataStructuresAndAlgorithmsInJava;

public class SinglyLinkNode<T> {
    T data;
    SinglyLinkNode<T> next;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public SinglyLinkNode<T> getNext() {
        return next;
    }

    public void setNext(SinglyLinkNode<T> next) {
        this.next = next;
    }

    SinglyLinkNode() {

    }

   public SinglyLinkNode(T data) {
        this.data = data;
        this.next = null;
    }

   public SinglyLinkNode(SinglyLinkNode node, T data) {
        this.data = data;
        this.next = node;
    }

}
