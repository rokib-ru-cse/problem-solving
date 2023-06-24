import java.util.Scanner;

public class Thelast2digits {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong()%Long.MAX_VALUE;
        long b = in.nextLong()%Long.MAX_VALUE;
        long res1 = (a*b)%Long.MAX_VALUE; 
        long c = in.nextLong()%Long.MAX_VALUE;
        long d = in.nextLong()%Long.MAX_VALUE;
        long res2 = (c*d)%Long.MAX_VALUE; 
        long res3 = (res1*res2)%Long.MAX_VALUE;
        if(res3%100==0){
            System.out.println("00");
        }else{
            System.out.println(res3%100);
        }
    }
}
