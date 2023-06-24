import java.util.*;

public class Test
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ar[][] = new int[4][n+1];

        for (int i = 1; i <4; i++) {
            for (int j = 1; j <=n; j++) {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("=====================");
        for(int i = 1; i <= n; i++) {
            int a = in.nextInt();
            System.out.println("xxx = "+a+" = "+ar[a][ ar[a][0] ]);
//            System.out.println("xxx = "+ ++ar[a][0]);
            ar[a][ ++ar[a][0] ]= i;
            System.out.println("yyy = "+a+" = "+ar[a][ ar[a][0] ]);
        }
        for (int i = 1; i <4; i++) {
            for (int j = 1; j <=n; j++) {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
        int ans = Math.min(ar[1][0], Math.min(ar[2][0], ar[3][0]) );
        System.out.printf("%d\n", ans);
        for(int i = 1; i <= ans; i++)
            System.out.printf("%d %d %d\n", ar[1][i], ar[2][i], ar[3][i]);

        in.close();
    }
}