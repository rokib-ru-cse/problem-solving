import java.io.BufferedReader;
import java.io.InputStreamReader;

public class VasyaTheHipster_581A {

    public static void main(String[] args) throws  Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        if(a==b){
            System.out.println(a +" "+0);
        }else{
            int c = Math.min(a,b);
            System.out.print(c+" ");
            if(a==c){
                System.out.print((b-c)/2);
            }else{
                System.out.print((a-c)/2);
            }
        }
    }
}
