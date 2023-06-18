package designpattern.factorypattern;

public class Doctor implements Profession{
    @Override
    public void print() {
        System.out.println("i am doctor");
    }
}
