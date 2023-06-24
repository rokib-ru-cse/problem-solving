import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PoliceRecruits_427A {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        int police=0;
        int untreaded = 0;
        for (String ss:s) {
            int a = Integer.parseInt(ss);
            if(a==-1 && police<1){
                untreaded++;
            }else if(a==-1 && police>0){
                police--;
            }else{
                police+=a;
            }
        }
        System.out.println(untreaded);
    }
}
