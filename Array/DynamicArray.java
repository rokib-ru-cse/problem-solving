package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DynamicArray {
    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        // Write your code here
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
//            List<Integer> innerArr = new ArrayList<>();
//            for (int j = 0; j < 2; j++) {
//                innerArr.add(0);
//            }
//            res.add(innerArr);
            res.add(new ArrayList<>());
        }
        int lastAnswer = 0;
        for (List<Integer> stringQueries :
                queries) {
            int a = stringQueries.get(0);
            int x = stringQueries.get(1);
            int y = stringQueries.get(2);
            if (a == 1) {
                int idx = (x ^ lastAnswer) % n;
                res.get(idx).add(y);
            } else {
                int idx = (x ^ lastAnswer) % n;
                List<Integer> seq = res.get(idx);
                int size = seq.size();
                int elIdx = y % size;
                lastAnswer = seq.get(elIdx);
                ans.add(lastAnswer);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int q = input.nextInt();
        List<List<Integer>> queries = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            List<Integer> qu = new ArrayList<>();
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            qu.add(a);
            qu.add(b);
            qu.add(c);
            queries.add(qu);
        }
        for (int x : dynamicArray(n, queries)) {
            System.out.print(x + " ");
        }
    }
}
