package pattern;

public class Piramid {
    public static void main(String[] args) {

        int n = 13;
        for (int i = 0, k = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (
                        (n / 2) + k == j || (n / 2) - k == j || n / 2 == i || n / 2 == j
                ) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            if (n / 2 > i) {
                k--;
            } else {
                k++;
            }
            System.out.println();
        }
    }
}
