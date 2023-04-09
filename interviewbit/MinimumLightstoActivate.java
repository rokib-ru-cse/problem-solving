package interviewbit;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MinimumLightstoActivate {
    public static int solve(ArrayList<Integer> A, int B) {
        int lastIndex=0;
        int firstIndex=0;
        int totalLight=0;
        boolean found = false;
        for (int i = 0; i < A.size(); i++) {
            firstIndex = i;
            lastIndex = i+(B-1);
            if(lastIndex>=A.size()){
                return  totalLight==0?1:totalLight;
            }
            found = false;
            for (int j = lastIndex; j >=firstIndex; j--) {
                if(A.get(j)==1){
                    found = true;
                    i = j+(B-1);
                    totalLight++;
                    break;
                }
            }
            if(!found){
                return  -1;
            }
        }
        return  totalLight==0?1:totalLight;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList( 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 0, 0));
        System.out.println(solve(A,12));
    }
}
