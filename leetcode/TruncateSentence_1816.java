package leetcode;

public class TruncateSentence_1816 {


    /*
     *
     * result="";
     * loop s: concate eact word to result with one space " ".
     * return restult.trim();
     * */
    public String truncateSentence(String s, int k) {
        String res = "";
        String[] splitedString = s.split(" ");
        for (int i = 0; i < k; i++) {
            res += splitedString[i] + " ";
        }
        return res.trim();
    }

    public static void main(String[] args) {

    }
}
