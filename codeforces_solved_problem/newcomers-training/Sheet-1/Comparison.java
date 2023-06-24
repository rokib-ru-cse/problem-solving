import java.util.Scanner;

public class Comparison {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        if (s.contains("=")) {
            if (Integer.parseInt(s.split("=")[0].trim()) == Integer.parseInt(s.split("=")[1].trim())) {
                System.out.println("Right");
            } else {
                System.out.println("Wrong");
            }
        } else if (s.contains(">")) {
            if (Integer.parseInt((s.split(">")[0].trim())) > Integer.parseInt(s.split(">")[1].trim())) {
                System.out.println("Right");
            } else {
                System.out.println("Wrong");
            }
        } else {
            if (Integer.parseInt(s.split("<")[0].trim()) < Integer.parseInt(s.split("<")[1].trim())) {
                System.out.println("Right");
            } else {
                System.out.println("Wrong");
            }
        }
    }
}
