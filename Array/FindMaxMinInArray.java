package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMaxMinInArray {


    private static int findMaxInArray1(List<Integer> list) {
        int max = Integer.MIN_VALUE;
        for (int value : list) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    private static int findMaxInArray2(List<Integer> list) {
        return Collections.max(list);
    }

    private static int findMaxInArray3(List<Integer> list) {
        return list.stream().max(Integer::compare).get();
    }

    private static int findMaxInArray4(List<Integer> list) {
        return list.stream().reduce(Integer.MIN_VALUE, Math::max);
    }


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(8);
        list.add(5);
        System.out.println(findMaxInArray1(list));
        System.out.println(findMaxInArray2(list));
        System.out.println(findMaxInArray3(list));
        System.out.println(findMaxInArray4(list));


        System.out.println(findMinInArray1(list));
        System.out.println(findMinInArray2(list));
        System.out.println(findMinInArray3(list));
        System.out.println(findMinInArray4(list));
    }

    private static int findMinInArray1(List<Integer> list) {
        int min = Integer.MAX_VALUE;
        for (int value : list) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    private static int findMinInArray2(List<Integer> list) {
        return Collections.min(list);
    }

    private static int findMinInArray3(List<Integer> list) {
        return list.stream().min(Integer::compare).get();
    }

    private static int findMinInArray4(List<Integer> list) {
        return list.stream().reduce(Integer.MAX_VALUE, Math::min);
    }
}
