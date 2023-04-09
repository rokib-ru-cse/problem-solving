package interviewbit;

import java.util.ArrayList;

public class MinStepsinInfiniteGrid {
    public static  int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        int sum=0;
        for (int i = A.size()-1; i >0; i--) {
            sum += Math.max(Math.abs(A.get(i)-A.get(i-1)),Math.abs(B.get(i)-B.get(i-1)));
        }
        return  sum;
    }

    public static void main(String[] args) {

    }
}
