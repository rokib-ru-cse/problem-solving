package Array;

import java.util.*;

public class FindkthMaxMinInArray {

    private static int findKthMaxInArray1(List<Integer> list, int kth) {
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        Arrays.sort(arr);
        return arr[arr.length - kth];
    }

    private static int findKthMaxInArray2(List<Integer> list, int kth) {
        Collections.sort(list);
        return list.get(list.size() - kth);
    }

    private static int findKthMaxInArray3(List<Integer> list, int kth) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(list);
        for (int i = 0; i < list.size() - kth; i++) {
            queue.poll();
        }
        return queue.peek();
    }


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(8);
        list.add(5);
        int kth = 2;
        System.out.println(findKthMaxInArray1(list, kth));
        System.out.println(findKthMaxInArray2(list, kth));
        System.out.println(findKthMaxInArray3(list, kth));


        System.out.println(findKthMinInArray1(list, kth));
        System.out.println(findKthMinInArray2(list, kth));
        System.out.println(findKthMinInArray3(list, kth));
    }

    private static int findKthMinInArray1(List<Integer> list, int kth) {
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        Arrays.sort(arr);
        return arr[kth - 1];
    }

    private static int findKthMinInArray2(List<Integer> list, int kth) {
        Collections.sort(list);
        return list.get(kth - 1);
    }

    private static int findKthMinInArray3(List<Integer> list, int kth) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(list);
        for (int i = 0; i < kth-1; i++) {
            queue.poll();
        }
        return queue.peek();
    }

}
