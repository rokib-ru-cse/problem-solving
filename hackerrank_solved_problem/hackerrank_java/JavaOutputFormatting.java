import java.util.Scanner;

public class JavaOutputFormatting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s = in.next();
            int j = in.nextInt();
            System.out.println(String.format("%-15s", s) + String.format("%03d", j));
        }
        System.out.println("================================");

    }
}
