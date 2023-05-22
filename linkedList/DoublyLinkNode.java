package linkedList;

public class DoublyLinkNode<T> {
    public T data;
    public DoublyLinkNode next;
    public DoublyLinkNode previous;

    public T data() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public DoublyLinkNode getNext() {
        return next;
    }

    public void setNext(DoublyLinkNode next) {
        this.next = next;
    }

    public DoublyLinkNode getPrevious() {
        return previous;
    }

    public void setPrevious(DoublyLinkNode previous) {
        this.previous = previous;
    }

    DoublyLinkNode() {
    }

    public DoublyLinkNode(T data) {
        this.data = data;
        next = null;
        previous = null;
    }
}
