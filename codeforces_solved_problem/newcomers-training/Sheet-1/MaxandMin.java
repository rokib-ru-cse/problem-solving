import java.util.Scanner;

public class MaxandMin {
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if(a>=b && a>=c){
            if(c<=b){
                System.out.println(c+" "+a);
            }else{
                System.out.println(b+" "+a);
            }
        }else if(b>=a && b>=c){
            if(a<=c){
                System.out.println(a+" "+b);
            }else{
                System.out.println(c+" "+b);
            }
        }else{
            if(a<=b){
                System.out.println(a+" "+c);
            }else{
                System.out.println(b+" "+c);
            }
        }
    }
}
