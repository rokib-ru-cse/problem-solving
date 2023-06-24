import java.util.Scanner;

public class Floatorint {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] s1 = new String[2];
        s1 = s.split("\\.");
        if (Integer.parseInt(s1[1]) == 0) {
            System.out.println("int " + s1[0]);
        } else {
            System.out.println("float " + s1[0] + " 0." + s1[1]);
        }
    }
}
