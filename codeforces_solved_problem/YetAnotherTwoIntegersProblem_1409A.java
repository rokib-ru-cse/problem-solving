import java.util.Scanner;

public class YetAnotherTwoIntegersProblem_1409A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-->0){
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(Math.abs(a-b)%10==0?Math.abs(a-b)/10:Math.abs(a-b)/10+1);
        }
    }
}
