package ecr124; /**
 * Main
 */
import java.util.Scanner;
public class A_ecr124 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int n;
        while(t-->0){
            n = in.nextInt();
            int m = (int)Math.pow(2, n);
            System.out.println(m-1);
        }
    }
}
