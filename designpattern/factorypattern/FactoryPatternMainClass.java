package designpattern.factorypattern;

public class FactoryPatternMainClass {


    public static void main(String[] args) {
        Profession profession = ProfessionFactory.getProfession("teacher");
        profession.print();
    }
}
