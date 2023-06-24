import java.util.Scanner;

public class CoordinatesofaPoint {
    
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        if(a>0&&b>0){
            System.out.println("Q1");
        }else if(a<0&&b>0){
            System.out.println("Q2");
        }else if(a<0&&b<0){
            System.out.println("Q3");
        }else if(a>0&&b<0){
            System.out.println("Q4");
        }else if(a==0 && b==0){
            System.out.println("Origem");
        }else if(a==0){
            System.out.println("Eixo Y");
        }else{
            System.out.println("Eixo X");
        }
    }
}
