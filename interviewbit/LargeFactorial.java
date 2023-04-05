package interviewbit;

public class LargeFactorial {
    
    public static String solve(int A) {
        String result="0";
        String res= "";
        for (int j = 1; j <= A; j++) {
            String fact =  fact(i,j);
            int carry=0;
            int i=result.length()-1,k=fact.length()-1;
            int a,b;
            
            while(i>-1 || k>-1){
                if(i>-1){
                     a = Integer.parseInt(result.charAt(i)+"");
                }else{
                     a = 0;
                }
                if(k>-1){
                     b = Integer.parseInt(fact.charAt(k)+"");
                }else{
                    b=0;
                }
                int data=0;
                if(a+b+carry>9){
                    carry = 1;
                    data = (a+b+carry)%10;
                }else{
                    carry = 0;
                    data = a+b+carry;
                }
                res = String.valueOf(data)+res;

                i--;
                k--;
            }
        }
        return res;
    }
    private static String fact(String i,long j) {
        long sum=0;
        for (int k = 1; k <= j; k++) {
            
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(solve(50));
    }
}
