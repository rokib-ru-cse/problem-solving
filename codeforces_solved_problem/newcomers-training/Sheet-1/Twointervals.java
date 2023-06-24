import java.util.Scanner;

public class Twointervals {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        if (a<=c && c<=b ) {
            if(b<=d){
                System.out.println(c + " " + b);
            }else{
                System.out.println(c + " " + d);
            }
        }else if (a>=c && a<=d ) {
            if(b>=d){
                System.out.println(a + " " + d);
            }else{
                System.out.println(a + " " + b);
            }
        }
         else {
            System.out.println(-1);
        }
    }
}
