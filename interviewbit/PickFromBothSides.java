package interviewbit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PickFromBothSides {
    

    public static int pickFromBothSides(List<Integer> A, int B){
        int firstPointer = 0;
        int lastPointer = A.size()-1;
        int sum=0;
        while(firstPointer<=lastPointer){
            if(A.get(firstPointer)>=A.get(lastPointer)){
                System.out.print(A.get(firstPointer)+" ");
                sum+=A.get(firstPointer);
                firstPointer++;
                B--;
            }else{
                System.out.print(A.get(lastPointer)+" ");
                sum+=A.get(lastPointer);
                lastPointer--;
                B--;
            }
            if(B==0){
                return sum;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(pickFromBothSides(Arrays.asList( -533, -666, -500, 169, 724, 478, 358, -38, -536, 705, -855, 281, -173, 961, -509, -5, 942, -173, 436, -609, -396, 902, -847, -708, -618, 421, -284, 718, 895, 447, 726, -229, 538, 869, 912, 667, -701, 35, 894, -297, 811, 322, -667, 673, -336, 141, 711, -747, -132, 547, 644, -338, -243, -963, -141, -277, 741, 529, -222, -684, 35 ),48));
    }
}
