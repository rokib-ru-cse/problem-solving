import java.util.Scanner;
public class Game_With_Sticks_451A {

    public static void main(String[] args) {
        int n, m;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        int cnt=0;
        while(m>0&&n>0){
            m--;
            n--;
            cnt++;
        }
        if(cnt%2==1){
            System.out.println("Akshat");
        }else{
            System.out.println("Malvika");
        }
    }
}
