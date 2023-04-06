package interviewbit;

public class LargeFactorial {
    
    public static String solve(int A) {
        String result="1";
        String res= "";
        for (int j = 1; j <= A; j++) {
            result =  fact(result,j);
            //System.out.println(j+" "+result);
        }
        return result;
    }
    private static String fact(String i,long j) {
        long sum=0;
        int carry=0;
        //int i=result.length()-1,k=fact.length()-1;
        String first = i;
        String second = "";

        int a,b;
        for (int l = 2; l <= j; l++) {
            second= i;
            int x = first.length()-1;
            int y = second.length()-1;
            String res = "";
            while(x>-1 || y>-1){
                if(x>-1){
                     a = Integer.parseInt(first.charAt(x)+"");
                }else{
                     a = 0;
                }
                if(y>-1){
                     b = Integer.parseInt(second.charAt(y)+"");
                }else{
                    b=0;
                }
                int data=0;
                if(a+b+carry>9){
                    data = (a+b+carry)%10;
                    carry = 1;
                }else{
                    data = a+b+carry;
                    carry = 0;
                }
                res = String.valueOf(data)+res;
                x--;
                y--;
            }
            if(carry>0){
                res = String.valueOf(carry)+res;
                carry = 0;
            }
            first = res;
            //System.out.println("first "+first);
        }
        if(carry>0){
            first = String.valueOf(carry)+first;
        }
        return String.valueOf(first);
    }
    public static void main(String[] args) {
        System.out.println(solve(500));
    }
}
