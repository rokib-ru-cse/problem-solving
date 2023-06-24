import java.util.Scanner;

public class Animal_1049 {
    public static void main(String[] args) {
        String s1, s2, s3;
        Scanner scan = new Scanner(System.in);
        s1 = scan.next();
        s2 = scan.next();
        s3 = scan.next();
        if (s1.equals("vertebrado")) {
            if (s2.equals("ave")) {
                if (s3.equals("carnivoro")) {
                    System.out.println("aguia");
                } else {
                    System.out.println("pomba");
                }
            } else {
                if (s3.equals("onivoro")) {
                    System.out.println("homem");
                } else {
                    System.out.println("vaca");
                }
            }
        } else {
            if (s2.equals("inseto")) {
                if (s3.equals("hematofago")) {
                    System.out.println("pulga");
                } else {
                    System.out.println("lagarta");
                }
            } else {
                if (s3.equals( "hematofago")) {
                    System.out.println("sanguessuga");
                } else {
                    System.out.println("minhoca");
                }
            }
        }
    }
}
