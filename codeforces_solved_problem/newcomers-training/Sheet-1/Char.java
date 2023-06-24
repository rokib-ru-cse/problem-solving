import java.util.Scanner;

public class Char {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char a = in.next().charAt(0);
        if (Character.isAlphabetic(a)) {
            if (Character.isLowerCase(a)) {
                System.out.println(Character.toUpperCase(a));
            } else {
                System.out.println(Character.toLowerCase(a));
            }
        }
    }
}

