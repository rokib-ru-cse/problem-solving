package linkedList;

public class SinglyLinkNode<T> {
   public T data;
    SinglyLinkNode<T> next;

    public T data() {
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
