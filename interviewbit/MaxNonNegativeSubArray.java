package interviewbit;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxNonNegativeSubArray {

    public static ArrayList<Integer> maxset(ArrayList<Integer> A) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int i = 0;
        ArrayList<Integer> temp = new ArrayList<>();
        while (i < A.size()) {
            if (A.get(i) >= 0) {
                temp.add(A.get(i));
            } else {
                if (temp.size() > 0) {
                    res.add(temp);
                }
                temp = new ArrayList<>();
            }
            i++;
        }
        if (temp.size() > 0) {
            res.add(temp);
        }
        System.out.println("res "+res );
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        long max = -1;
        long sum = 0;
        for (ArrayList<Integer> arr : res) {
            for (Integer integer : arr) {
                sum += integer;
            }
            
            if (sum > max) {
                result = new ArrayList<>();
                result.add(arr);
                max = sum;
                sum = 0;
            }
            else if(sum == max) {
                result.add(arr);
                max = sum;
                sum = 0;
            }else{
                sum=0;
            }
        }
        System.out.println(result);
        if(result.size()==1){
            return result.get(0);
        }else{
            ArrayList<Integer> result1 = new ArrayList<>();
            int size=0;
            for (ArrayList<Integer> a : result) {
                if(a.size()>size){
                    result1 = a;
                    size = a.size();
                }
            }
            return result1;
        }
        
    }

    public static void main(String[] args) {
       ArrayList<Integer> res=  maxset(new ArrayList<>(Arrays.asList(24831, 53057, 19790, -10679, 77006, -36098, 75319, -45223, -56760, -86126, -29506, 76770, 29094, 87844, 40534, -15394, 18738, 59590, -45159, -64947, 7217, -55539, 42385, -94885, 82420, -31968, -99915, 63534, -96011, 24152, 77295 )));
       System.out.println("result ===== "+res);
    }
}
