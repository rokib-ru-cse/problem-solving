import java.util.Scanner;

public class JavaCurrencyFormatter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();
        if(n>1000){
            System.out.printf("US: u%d,%.2f\n",(int)(n/1000),n%1000);
            System.out.printf("India: i.%d,%.2f\n",(int)(n/1000),n%1000);
            System.out.printf("China: c%d,%.2f\n",(int)(n/1000),n%1000);
            System.out.printf("France: f%d %.2f €\n",(int)(n/1000),n%1000);
        }else{
            System.out.printf("US: u%.2f\n",n%1000);
            System.out.printf("India: i.%.2f\n",n%1000);
            System.out.printf("China: c%.2f\n",n%1000);
            System.out.printf("France: f%.2f €\n",n%1000);
        }
        
    }
}
