import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CheapTravel_466A {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int a = Integer.parseInt(s[2]);
        int b = Integer.parseInt(s[3]);
        int offer = ((n / m) * b) + ((n % m) * a);
        int actual = n * a;
        int temp = n % m == 0 ? (n / m) * b : ((n / m)+1) * b;
        System.out.println(Math.min(temp, Math.min(offer, actual)));

    }
}
