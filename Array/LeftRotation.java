package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeftRotation {

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        int firstIndex = arr.size()-(d%arr.size());
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            res.add(0);
        }


        for (int i = 0; i <arr.size(); i++) {
            res.set((firstIndex++)%arr.size(), arr.get(i));
        }
        return res;
    }
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,2,3,4,5);
        for (int s:
             rotateLeft(2,arr)) {
            System.out.print(s+" ");
        }
    }
}
