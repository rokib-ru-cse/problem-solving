import java.util.Scanner;

public class Twonumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        double c = a/(double)b;
        System.out.println("floor "+a+" / "+b+" = "+(int)Math.floor(c));
        System.out.println("ceil "+a+" / "+b+" = "+(int)Math.ceil(c));
        System.out.println("round "+a+" / "+b+" = "+Math.round(c));
    }
}
