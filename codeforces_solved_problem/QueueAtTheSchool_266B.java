import java.util.Scanner;

/**
 * QueueAtTheSchool_266B
 */
public class QueueAtTheSchool_266B {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        String s = in.next();
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < sb.length()-1;j++) {
                if(sb.charAt(j)=='B' && sb.charAt(j+1)=='G'){
                    char temp = sb.charAt(j);
                    sb.setCharAt(j, sb.charAt(j+1));
                    sb.setCharAt(j+1, temp);
                    j++;
                }
            }
        }
        System.out.println(sb);
    }
}