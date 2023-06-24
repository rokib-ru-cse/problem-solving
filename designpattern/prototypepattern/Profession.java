package designpattern.prototypepattern;

public abstract class Profession implements Cloneable {

    public int id;
    public String name;

    abstract void print();

    public Object cloningMethod() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return clone;
    }


}
