package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayManipulation {
    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        // Write your code here
        List<Long> res = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            res.add(0l);
        }
        for (List<Integer> q : queries) {
            int a = q.get(0) - 1;
            int b = q.get(1) - 1;
            int k = q.get(2);

            res.set(a, res.get(a) + k);
            res.set(b + 1, res.get(b + 1) - k);
        }
        long sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += res.get(i);
            res.set(i, sum);
        }
        return Collections.max(res);
    }


    public static void main(String[] args) {

    }
}
