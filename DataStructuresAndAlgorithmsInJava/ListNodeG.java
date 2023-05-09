package DataStructuresAndAlgorithmsInJava;

public class ListNodeG<T> {
    T data;
    ListNodeG next;

    ListNodeG(){}
    ListNodeG(T data){
        this.data = data;
        this.next = null;
    }

}
