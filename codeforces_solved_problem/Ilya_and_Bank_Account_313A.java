import java.util.Scanner;
public class Ilya_and_Bank_Account_313A {

    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        if(n<0){
            int a = n/10;
            int b = n%10;
            int c = (10*(n/100))+b;
            if(a>c){
                System.out.println(a);
            }else{
                System.out.println(c);
            }
            // System.out.println(a+" "+b+" "+c);
        }else{
            System.out.println(n);
        }
    }
}

