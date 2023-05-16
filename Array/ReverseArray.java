package Array;

import java.util.ArrayList;
import java.util.List;

public class ReverseArray {

    public static List<Integer> reverseArray(List<Integer> a) {
        // Write your code here
        List<Integer> res = new ArrayList<>();
        for (int i=a.size()-1;i>=0;i--){
            res.add(a.get(i));
        }
        return res;
    }
    public static void main(String[] args) {

    }
}
