import java.util.Scanner;

public class Interval {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        if(x>=0.0 && x<=25.0){
            System.out.println("Interval [0,25]");
        }else if(x>25.0 && x<=50.0){
            System.out.println("Interval (25,50]");
        }else if(x>50.0 && x<=75.0){
            System.out.println("Interval (50,75]");
        }
        else if(x>75.0 && x<=100.0){
            System.out.println("Interval (75,100]");
        }
        else {
            System.out.println("Out of Intervals");
        }
    }
}
