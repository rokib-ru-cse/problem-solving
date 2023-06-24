import java.util.Scanner;

public class JavaSubstring {
    public static void main(String[] args) {
        String s1;
        Scanner in = new Scanner(System.in);
        s1 = in.nextLine();
        int a,b;
        a = in.nextInt();
        b = in.nextInt();
        System.out.println(s1.substring(a,b));
    }
}
