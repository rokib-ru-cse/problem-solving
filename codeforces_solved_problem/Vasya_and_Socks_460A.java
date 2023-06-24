import java.util.Scanner;
public class Vasya_and_Socks_460A{

    public static void main(String[] args) {
        int n, m;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        int sum = n;
        int x = m;
        for (int i = 2; x <= sum; i++) {
            sum+=1;
            x = i*m;
        }
        System.out.println(sum);

    }
}
