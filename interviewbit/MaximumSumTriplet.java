package interviewbit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MaximumSumTriplet {

    public static int solve(ArrayList<Integer> A) {
//        int coreCount = Runtime.getRuntime().availableProcessors();
//        ExecutorService service = Executors.newFixedThreadPool(coreCount);
//        System.out.println("core "+coreCount);
        int firstPointer = 0;
        int lastPointer = A.size() - 1;
        int midPointer = firstPointer + 1;
        int max = Integer.MIN_VALUE;
        boolean shouldLastPointerDecrease = true;
        //2, 5, 3, 1, 4, 9
        while (firstPointer < lastPointer-1 && midPointer < lastPointer) {
            int sum = A.get(firstPointer) + A.get(midPointer) + A.get(lastPointer);
            if(A.get(firstPointer)<A.get(midPointer) && A.get(midPointer)<A.get(lastPointer) && sum>max){
                max = sum;
            }
            midPointer++;
            if (midPointer == lastPointer && shouldLastPointerDecrease) {
                lastPointer--;
                midPointer = firstPointer + 1;
            }else if(midPointer == lastPointer && !shouldLastPointerDecrease) {
                firstPointer++;
                midPointer = firstPointer + 1;
            }

            if(lastPointer-1==firstPointer && shouldLastPointerDecrease){
                shouldLastPointerDecrease=false;
                firstPointer = firstPointer+1;
                lastPointer =A.size()-1;
                midPointer = firstPointer+1;
            }
        }
        return max;
    }

    //ans = 88252
    public static void main(String[] args) {
        System.out.println(solve(new ArrayList<>(Arrays.asList(18468, 6335, 26501, 19170, 15725, 11479, 29359, 26963, 24465, 5706, 28146, 23282, 16828, 9962, 492, 2996, 11943, 4828, 5437, 32392, 14605))));
//        System.out.println(solve(new ArrayList<>(Arrays.asList(2, 5, 3, 1, 4, 9))));
    }
}
