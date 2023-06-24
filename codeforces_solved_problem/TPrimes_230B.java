import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TPrimes_230B {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] primes = new int[10000001];
        for (int i = 2; i <= 1000000; i++) {
            primes[i] = 1;
        }
        for (int i = 2; i <= 1000; i++) {
            for (int j = 2 * i; j <= 1000000; j += i) {
                primes[j] = 0;
            }
        }

        String[] z = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < n; j++) {
            long b = Long.parseLong(z[j]);
            double x = Math.sqrt(b);
            if (x == (int) x && primes[(int) x] == 1)
                sb.append("YES\n");
            else
                sb.append("NO\n");
        }
        System.out.println(sb);

    }
}
