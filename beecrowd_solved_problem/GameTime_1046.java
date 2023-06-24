import java.util.Scanner;

class GameTime_1046{
    public static void main(String[] args){
        int a,b;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        if(a>=b){
            System.out.println("O JOGO DUROU "+(24-a+b)+" HORA(S)");
        }else{
            System.out.println("O JOGO DUROU "+(b-a)+" HORA(S)");
        }


    }
}