import java.util.Scanner;

public class BasicDataTypes {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        long b = in.nextLong();
        char c = in.next().charAt(0);
        float d = in.nextFloat();
        double e = in.nextDouble();
        System.out.println(a); 
        System.out.println(b); 
        System.out.println(c); 
        System.out.println(d); 
        System.out.println(e); 
    }
}
