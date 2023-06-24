import java.util.Scanner;

public class JavaSubstringComparisons {
    public static void main(String[] args) {
        String s1;
        Scanner in = new Scanner(System.in);
        s1 = in.nextLine();
        int a;
        a = in.nextInt();
        String ss = "zzzzzzzzzzzzzzzzzzzzzz", mm = "";

        for (int i = 0; i < s1.length()-2; i ++) {
            
            // System.out.println(i+" "+s1.substring(i, i + a).compareTo(ss));
            if (s1.substring(i, i + a).compareTo(ss) < 0) {
                ss = s1.substring(i, i + a);
            }
            // System.out.println(s1.substring(i, i + a).compareTo(ss));
            if (s1.substring(i, i + a).compareTo(mm) > 0) {
                mm = s1.substring(i, i + a);
            }
        }
        System.out.println(ss);
        System.out.println(mm);
    }
}
