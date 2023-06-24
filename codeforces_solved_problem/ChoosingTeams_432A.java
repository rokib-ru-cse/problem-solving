import java.util.Scanner;

public class ChoosingTeams_432A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int x = 0;
        int y = 0;
        for (int i = 0; i < n; i++) {
            x = in.nextInt();
            x += k;
            if (x <= 5) {
                y++;
            }
        }
        System.out.println(y / 3);
    }
}
