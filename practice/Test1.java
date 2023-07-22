package practice;

public class Test1 {

    static int[] s(int[] x,int[] y){
        int[] res = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            int index = y[i];
            if (res[index] != 0) {
                int shift = 1;
                while (res[index + shift] != 0) {
                    shift++;
                }
                for (int j = index + shift; j > index; j--) {
                    res[j] = res[j - 1];
                }
            }
            res[index] = x[i];
        }

        return  res;
    }

    public static void main(String[] args) {
        for (int a:
             s(new int[]{1,2,3,4,5},new int[]{0,1,2,2,1})) {
            System.out.print(a+" ");
        }
    }
        }
