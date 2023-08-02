package Array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ReverseArray {

    public static List<Integer> reverseArray1(List<Integer> arr) {
        List<Integer> res = new ArrayList<>();
        for (int i = arr.size() - 1; i >= 0; i--) {
            res.add(arr.get(i));
        }
        return res;
    }

    public static List<Integer> reverseArray5(List<Integer> arr) {
        for (int i = 0; i < arr.size() / 2; i++) {
            int temp = arr.get(arr.size() - i - 1);
            arr.set(arr.size() - i - 1, arr.get(i));
            arr.set(i, temp);
        }
        return arr;
    }

    public static List<Integer> reverseArray2(List<Integer> arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.size(); i++) {
            stack.add(arr.get(i));
        }
        int len = arr.size();
        arr.clear();
        for (int i = 0; i < len; i++) {
            arr.add( stack.pop());
        }
        return arr;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        print(reverseArray1(list));
        print(reverseArray2(list));
        print(reverseArray5(list));
    }

    private static void print(List<Integer> list) {
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
