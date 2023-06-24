import java.util.Scanner;

public class CandiesAndTwoSisters_1335A {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n-->0){
            int a = in.nextInt();
            System.out.println(a%2==0?(a/2)-1:a/2);
        }
    }
}
