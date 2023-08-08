package others;

import java.util.ArrayList;
import java.util.List;

/**
 * FindandReplacePattern
 */
public class FindandReplacePattern {

    public List<String> findAndReplacePattern(String[] words, String pattern) {

        List<Integer> s = new ArrayList<Integer>();
        List<List<Integer>> ss = new ArrayList<List<Integer>>();
        char fc = pattern.toCharArray()[0];
        int cnt = 1;
        for (int i = 1; i < pattern.toCharArray().length; i++) {
            if (pattern.toCharArray()[i] == pattern.toCharArray()[i - 1]) {
                cnt++;
            } else {
                s.add(cnt);
                cnt = 1;
            }
        }
        s.add(cnt);

        for (String x : words) {
            List<Integer> v = new ArrayList<>();
            cnt = 1;
            for (int i = 1; i < x.toCharArray().length; i++) {
                if (x.toCharArray()[i] == x.toCharArray()[i - 1]) {
                    cnt++;
                } else {
                    v.add(cnt);
                    cnt = 1;
                }
            }
            v.add(cnt);
            ss.add(v);
        }
        List<String> res=new ArrayList<>();
        int k=0;
        for (List<Integer> list : ss) {
            int j=0;
            
            boolean flag = false;
            for (int b : list) {
                if(b==s.get(j)){
                    flag=true;
                }else{
                    flag=false;
                    break;
                }
                j++;
            }
            if(flag){
                res.add(words[k]);
            }
            k++;
        }
        return res;
    }

    public static void main(String[] args) {
        for (String string : new FindandReplacePattern().findAndReplacePattern(
                new String[] { "abc","cba","xyx","yxx","yyx"},
                "abc")) {
            System.out.println(string);
        }
    }
}