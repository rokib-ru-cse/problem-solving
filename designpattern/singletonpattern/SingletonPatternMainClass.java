package designpattern.singletonpattern;

public class SingletonPatternMainClass {


    public static void main(String[] args) {
        SingletonPatternClass obj1 = SingletonPatternClass.getInstance();
        SingletonPatternClass obj2 = SingletonPatternClass.getInstance();

        System.out.println(obj1==obj2);
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
