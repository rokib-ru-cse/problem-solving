import java.util.Scanner;

public class SalaryIncrease_1048 {
    public static void main(String[] args) {
        float a ;
        Scanner scan = new Scanner(System.in);
        a = scan.nextFloat();
        if(a>=0&&a<=400.00){
            float c  = (float)15.0;
            float b = (float)(c/100)*a;
            a = a+b;
            System.out.println("Novo salario: "+String.format("%.2f", a));
            System.out.println("Reajuste ganho: "+String.format("%.2f", b));
            System.out.println("Em percentual: "+(int)c+" %");
        }else if(a<=800.00){
            float c  = (float)12.0;
            float b = (float)(c/100)*a;
            a = a+b;
            System.out.println("Novo salario: "+String.format("%.2f", a));
            System.out.println("Reajuste ganho: "+String.format("%.2f", b));
            System.out.println("Em percentual: "+(int)c+" %");
        }else if(a<=1200.00){
            float c  = (float)10.0;
            float b = (float)(c/100)*a;
            a = a+b;
            System.out.println("Novo salario: "+String.format("%.2f", a));
            System.out.println("Reajuste ganho: "+String.format("%.2f", b));
            System.out.println("Em percentual: "+(int)c+" %");
        }else if(a<=2000.00){
            float c  =(float) 7.0;
            float b = (float)(c/100)*a;
            a = a+b;
            System.out.println("Novo salario: "+String.format("%.2f", a));
            System.out.println("Reajuste ganho: "+String.format("%.2f", b));
            System.out.println("Em percentual: "+(int)c+" %");
        }else if(a>2000.00){
            float c  =(float) 4.0;
            float b = (float)(c/100)*a;
            a = a+b;
            System.out.println("Novo salario: "+String.format("%.2f", a));
            System.out.println("Reajuste ganho: "+String.format("%.2f", b));
            System.out.println("Em percentual: "+(int)c+" %");
        }
    }
}
