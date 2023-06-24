import java.util.Scanner;

public class AreaofaCircle {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        double r = in.nextDouble();
        double pi = 3.141592653;
        System.out.printf("%.9f",pi*(r*r));
    }
}
