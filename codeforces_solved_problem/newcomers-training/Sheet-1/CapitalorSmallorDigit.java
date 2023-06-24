import java.util.Scanner;

public class CapitalorSmallorDigit {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char a = in.next().charAt(0);
        if (Character.isAlphabetic(a)) {
            if (Character.isLowerCase(a)) {
                System.out.println("ALPHA\nIS SMALL");
            } else {
                System.out.println("ALPHA\nIS CAPITAL");
            }
        }
        if(Character.isDigit(a)){
            System.out.println("IS DIGIT");
        }
    }
}
