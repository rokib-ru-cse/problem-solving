import java.util.Scanner;

public class JavaDatatypes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            try {
                long n = in.nextLong();
            if(n>=-128 && n<=127){
                System.out.println(n+" can be fitted in:");
                System.out.println("* byte");
                System.out.println("* short");
                System.out.println("* int");
                System.out.println("* long");
            }else if(n>=-32768 && n<=32767){
                System.out.println(n+" can be fitted in:");
                System.out.println("* short");
                System.out.println("* int");
                System.out.println("* long");
            }else if(n>=-2147483648 && n<=2147483647){
                System.out.println(n+" can be fitted in:");
                System.out.println("* int");
                System.out.println("* long");
            }else if(n>=-Math.pow(2, 63) && n<=Math.pow(2, 63)-1){
                System.out.println(n+" can be fitted in:");
                System.out.println("* long");
            }
            } catch(Exception e)
            {
                System.out.println(in.next()+" can't be fitted anywhere.");
            }
        }
    }
}
