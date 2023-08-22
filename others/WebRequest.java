package others;

import java.util.*;

public class WebRequest {

    private static List<String> processedUrl(List<String> urls) {
//       0 index = element counter within 5 seconds
//       1 index = element counter within 30 seconds
//       2 index = counter of 5 seconds
//       3 index = counter of 30 seconds
        Map<String, List<Integer>> processed = new LinkedHashMap<>();
        int counter = 0;
        // mission updation all XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
        List<Map<String, String>> result = new ArrayList<>();
        for (String url : urls) {
            if (processed.containsKey(url)) {
                List<Integer> allCounters = processed.get(url);
                if (allCounters.get(2) <= 5
                        && allCounters.get(0) <= 2 && allCounters.get(1) <= 5 && allCounters.get(3) < 30) {
                    allCounters.set(0, allCounters.get(0) + 1);
                    allCounters.set(1, allCounters.get(1) + 1);
                    allCounters.set(2, allCounters.get(2) + 1);
                    allCounters.set(3, allCounters.get(3) + 1);
                    processed.put(url, allCounters);
                } else {
                    Map<String, String> res = new LinkedHashMap<>();
                    res.put(url, "NO");
                    result.add(res);
                }
            } else {
                List<Integer> arrOffourCounter = new ArrayList<>();
                arrOffourCounter.add(1);
                arrOffourCounter.add(1);
                arrOffourCounter.add(1);
                arrOffourCounter.add(1);
                processed.put(url, arrOffourCounter);
            }
        }
        List<String> ans = new ArrayList<>();
        for (String url : urls) {
            if (processed.containsKey(url)) {
                ans.add(url + " OK");
            } else {
                ans.add(url + " NO");
            }
        }

        return ans;
    }


    public static void main(String[] args) {
        List<String> url = new ArrayList<>();
        url.add("S");
        url.add("A");
        url.add("B");
        url.add("A");
        url.add("C");
        url.add("A");
        url.add("S");
        url.add("A");
        url.add("F");
        url.add("D");
        url.add("A");
        url.add("B");
        url.add("C");
        url.add("Z");
        url.add("S");
        url.add("V");
        url.add("V");
        url.add("H");
        url.add("U");
        url.add("H");
        url.add("H");
        url.add("S");
        url.add("J");
        url.add("C");
        url.add("D");
        url.add("H");
        url.add("S");
        url.add("K");
        url.add("S");
        url.add("L");
        url.add("s");
        url.add("K");
        url.add("C");
        url.add("C");
        url.add("B");

        System.out.println(url.size());
        for (String str : processedUrl(url)) {
            System.out.println(str);
        }
    }


}
