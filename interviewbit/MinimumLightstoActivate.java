package interviewbit;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MinimumLightstoActivate {
    public static int solve(ArrayList<Integer> A, int B) {
        int lastIndex=0;
        int totalLight=0;
        for (int i = 0; i < A.size(); i++) {
            if(A.get(i)==1){
                lastIndex++;
                if(lastIndex-(B+1)>0){
                    return -1;
                }else{
                    totalLight++;
                    lastIndex = i;
                    i = i+(B-1);
                }
            }else{
                lastIndex++;
            }
        }
        return  totalLight;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(0, 0, 1, 1, 1, 0, 0, 1));
        System.out.println(solve(A,3));
    }
}
