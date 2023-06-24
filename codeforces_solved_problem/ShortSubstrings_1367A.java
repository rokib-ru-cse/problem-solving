import java.util.Scanner;

public class ShortSubstrings_1367A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-->0){
            String s = in.next();
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <s.length(); i+=2) {
                sb.append(s.charAt(i));
            }
            System.out.println(s.charAt(0)+sb.toString());
        }
    }
}
