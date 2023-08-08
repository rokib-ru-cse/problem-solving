package common;

class Company {
    String companyName;

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                '}';
    }
}

public class Test {


    private Company company;

    private static void setName1(Company c) {
        if (c == null) {
            c = new Company();
            c.companyName = "Name Changed 1 when null";
            return;
        }
        c.companyName = "Name Changed 1";
    }

    private void setName2(Company c) {
        if (c == null) {
            c = new Company();
            c.companyName = "Name Changed 2 when null";
            return;
        }
        c.companyName = "Name Changed 2";
    }

    public static void main(String[] args) {
        Test t = new Test();
        setName1(t.company);
        System.out.println(t.company);
        t.setName2(t.company);
        System.out.println(t.company);

    }
}
