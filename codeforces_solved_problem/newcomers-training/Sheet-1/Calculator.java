import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        if (s.contains("+")) {
            int a = Integer.parseInt(s.split("\\+")[0]);
            int b = Integer.parseInt(s.split("\\+")[1]);
            System.out.println(a+b);
        } 
        else if (s.contains("-")) {
            int a = Integer.parseInt(s.split("\\-")[0]);
            int b = Integer.parseInt(s.split("\\-")[1]);
            System.out.println(a-b);
        } else if (s.contains("*")) {
            int a = Integer.parseInt(s.split("\\*")[0]);
            int b = Integer.parseInt(s.split("\\*")[1]);
            System.out.println(a*b);
        } else {
            int a = Integer.parseInt(s.split("\\/")[0]);
            int b = Integer.parseInt(s.split("\\/")[1]);
            System.out.println(a/b);
        }

    }
}
