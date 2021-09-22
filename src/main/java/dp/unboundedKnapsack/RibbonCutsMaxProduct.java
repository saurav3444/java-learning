package dp.unboundedKnapsack;

import java.util.Arrays;

import static java.lang.Math.max;

/*

    https://www.youtube.com/watch?v=IRwVmTmN6go

        dp[i][j] = max( dp[i-1][j], dp[i][j-i]+val[i])

 */


public class RibbonCutsMaxProduct {

    public static void main(String[] args) {

        int n = 10;
        int count = ribbonProduct(n);
        System.out.println(count);

    }

    private static int ribbonProduct(int n) {

        int[] arr = new int[n+1];

        int[] table = new int[n+1];
        Arrays.fill(table, 1);
        for(int i=0; i<n; i++)
            arr[i]=i+1;

        for(int i=0; i<n; i++){
            for(int j=arr[i]; j<=n; j++){

                table[j]=max(table[j], table[j/arr[i]]*arr[j]);

            }
        }
        for(int x: table)
            System.out.print(x + " ");
        return table[n];
    }

}
