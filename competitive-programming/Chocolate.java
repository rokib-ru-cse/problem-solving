import java.util.Scanner;

public class Chocolate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int taka = in.nextInt();
        int total_chocolate = taka;
        int wrapper = taka;
        int remaining = 0;
        while(wrapper>2){
            total_chocolate+=wrapper/3;
            remaining = wrapper%3;
            wrapper= (wrapper/3)+remaining;
        }
        System.out.println(total_chocolate);
    }
}
