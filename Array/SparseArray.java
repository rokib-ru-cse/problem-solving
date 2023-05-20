package Array;

import java.util.ArrayList;
import java.util.List;

public class SparseArray {

    public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        // Write your code here
        List<Integer> res = new ArrayList<>();
        for (String query : queries) {
            int cnt=0;
            for (String match:stringList) {
                if (match.equals(query)){
                    cnt++;
                }
            }
            res.add(cnt);
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
