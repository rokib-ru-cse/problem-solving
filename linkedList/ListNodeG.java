package linkedList;

public class ListNodeG<T> {
    public T data;
    public ListNodeG next;

    ListNodeG() {
    }

    public ListNodeG(T data) {
        this.data = data;
        this.next = null;
    }

}
