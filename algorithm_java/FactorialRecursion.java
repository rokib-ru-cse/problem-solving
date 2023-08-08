package algorithm_java;

import java.util.Scanner;

public class FactorialRecursion {
    private static int m = 1000000009;

    public static long fact(long a){
        if(a==0){
            return 1;
        }else{
            return (a*(fact(a-1)%m))%m;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        System.out.println(fact(a));
    }

}
