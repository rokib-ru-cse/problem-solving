package interview;

public class NthMultiplication {

    public static int nthMultiplication(int n){
        if (n==1){
            return n;
        }
        return n*nthMultiplication(n-1);
    }

    public static void main(String[] args) {
        System.out.println(nthMultiplication(5));
    }
}
