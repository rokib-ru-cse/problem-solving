package others;

import java.util.*;
import java.util.stream.Collectors;

public class FindingDuplicateInAnArray {

    private static void findingDuplicateInAnArray1(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for (int value : arr) {
            freqMap.put(value, freqMap.getOrDefault(value, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > 1) {
                res.add(entry.getKey());
            }
        }
        res.stream().forEach(System.out::print);
        System.out.println();
    }

    private static void findingDuplicateInAnArray2(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        List<Integer> res = new ArrayList<>();
        for (int value : arr) {
            if (seen.contains(value)) {
                res.add(value);
            } else {
                seen.add(value);
            }
        }
        res.stream().forEach(System.out::print);
        System.out.println();
    }

    private static void findingDuplicateInAnArray3(int[] arr) {
        Arrays.sort(arr);
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                res.add(arr[i]);
            }
        }
        res.stream().forEach(System.out::print);
        System.out.println();
    }

    private static void findingDuplicateInAnArray4(int[] arr) {
        List<Integer> res = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(num -> num, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        res.stream().forEach(System.out::print);
        System.out.println();
    }

    public static void main(String[] args) {
        findingDuplicateInAnArray1(new int[]{1, 2, 3, 4, 4, 5, 5, 1, 2, 8, 8});
        findingDuplicateInAnArray2(new int[]{1, 2, 3, 4, 4, 5, 5, 1, 2, 8, 8});
        findingDuplicateInAnArray3(new int[]{1, 2, 3, 4, 4, 5, 5, 1, 2, 8, 8});
        findingDuplicateInAnArray4(new int[]{1, 2, 3, 4, 4, 5, 5, 1, 2, 8, 8});
    }
}
