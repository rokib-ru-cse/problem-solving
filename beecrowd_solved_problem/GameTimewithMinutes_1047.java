import java.util.Scanner;

public class GameTimewithMinutes_1047 {
    public static void main(String[] args) {
        int a, b, c, d;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        d = scan.nextInt();
        int x = (a*60)+b;
        int y = (c*60)+d;
        if(x>=y){
            int z = ((24*60)-(x))+y;
            int h = z/60;
            int m = z%60;
            System.out.println("O JOGO DUROU "+h+" HORA(S) E "+m+" MINUTO(S)");
        }else{
            int z = y-x;
            int h = z/60;
            int m = z%60;
            System.out.println("O JOGO DUROU "+h+" HORA(S) E "+m+" MINUTO(S)");
        }
    }
}
