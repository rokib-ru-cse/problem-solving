import java.util.Scanner;

public class AgeinDays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(a/365+" years");
        a%=365;
        System.out.println(a/30+" months");
        a%=30;
        System.out.println(a+" days");
    }
}
