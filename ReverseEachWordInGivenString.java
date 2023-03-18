public class ReverseEachWordInGivenString {

    public String reverseEachWordInGivenStringUsingReverse(String s) {
        StringBuilder sb = new StringBuilder();

        for (String str : s.split(" ")) {
            sb.append(new StringBuilder(str).reverse());
            sb.append(" ");
        }

        return sb.toString().trim();
    }

    public String reverseEachWordInGivenStringUsingLoop(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sbTemp = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                StringBuilder sbtemp1 = new StringBuilder();
                for (int i = sbTemp.length() - 1; i >= 0; i--) {
                    sbtemp1.append(sbTemp.charAt(i));
                }
                sbtemp1.append(' ');
                sbTemp = new StringBuilder();
                sb.append(sbtemp1);
            } else {
                sbTemp.append(c);
            }
        }
        StringBuilder sbtemp1 = new StringBuilder();
        for (int i = sbTemp.length() - 1; i >= 0; i--) {
            sbtemp1.append(sbTemp.charAt(i));
        }
        sbtemp1.append(' ');
        sbTemp = new StringBuilder();
        sb.append(sbtemp1);
        return sb.toString().trim();
    }

    public String reverseEachWordInGivenStringUsingSplitLoop(String s) {
        StringBuilder sb = new StringBuilder();
        for (String str : s.split(" ")) {
            for (int i = str.length() - 1; i >= 0; i--) {
                sb.append(str.charAt(i));
            }
            sb.append(' ');
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(new ReverseEachWordInGivenString().reverseEachWordInGivenStringUsingReverse("abc xyz 123"));
        System.out.println(new ReverseEachWordInGivenString().reverseEachWordInGivenStringUsingLoop("abc 123 xyz"));
        System.out
                .println(new ReverseEachWordInGivenString().reverseEachWordInGivenStringUsingSplitLoop("abc 123 xyz"));
    }
}
