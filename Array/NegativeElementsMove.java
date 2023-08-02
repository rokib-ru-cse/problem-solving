package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class NegativeElementsMove {

    private static List<Integer> negativeElementsMove1(List<Integer> list) {
        List<Integer> newList = new ArrayList<>();
        for (int value : list) {
            if (value < 0) {
                newList.add(0, value);
            } else {
                newList.add(value);
            }
        }
        return newList;
    }

    private static List<Integer> negativeElementsMove2(List<Integer> list) {
        int left = 0;
        int right = list.size() - 1;
        while (left < right) {
            if (list.get(left) < 0) {
                left++;
            } else if (list.get(right) >= 0) {
                right--;
            } else if (list.get(left) > 0 && list.get(right) < 0) {
                int temp = list.get(left);
                list.set(left, list.get(right));
                list.set(right, temp);
                left++;
            }
        }
        return list;
    }

    private static List<Integer> negativeElementsMove3(List<Integer> list) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(list);
        for (int i = 0; i < list.size(); i++) {
            list.set(i, queue.poll());
        }
        return list;
    }

    private static List<Integer> negativeElementsMove4(List<Integer> list) {
        Collections.sort(list);
        return list;
    }

    private static List<Integer> negativeElementsMove5(List<Integer> list) {
        List<Integer> negative = list.stream().filter(i -> i < 0).collect(Collectors.toList());
        List<Integer> nonNegative = list.stream().filter(i -> i >= 0).collect(Collectors.toList());
        list.clear();
        list.addAll(negative);
        list.addAll(nonNegative);
        return list;

    }


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(-1);
        list.add(3);
        list.add(2);
        list.add(8);
        list.add(-5);
        print(negativeElementsMove1(list));
        print(negativeElementsMove2(list));
        print(negativeElementsMove3(list));
        print(negativeElementsMove4(list));
        print(negativeElementsMove5(list));
    }


    private static void print(List<Integer> list) {
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
