package dp.unboundedKnapsack;

import java.util.Arrays;
/*

    total combinations to make target
        https://www.youtube.com/watch?v=L27_JpN6Z1Q
        2d array
        include
        exclude
        add dp[i-1][j] + dp[i][j-arr[i]]



 */
public class CoinExchange {

    private static int count;

    public static void main(String[] args) {

        int coins[] = {2,3,1};
        int sum = 4;
        int n = coins.length;

//      count = solveUnboundedCountSubsetSumBruteForce(coins, sum, n, dp);
        count = solveCoinExchangeBottomUp(coins, n, sum);
        System.out.println(count);
    }

    private static int solveCoinExchangeBottomUp(int[] arr, int n, int sum){

        int[] table = new int[sum+1];

        Arrays.fill(table, 0);

        table[0]=1;
        /*
            1
            0 1 '2' 3 4

         */
        for(int i=0;i<n;i++)
            for(int j=arr[i];j<=sum;j++)
                    table[j] += table[j-arr[i]];

        return table[sum];
    }

    private static int solveUnboundedCountSubsetSumBruteForce(int[] coins, int sum, int n) {


        if(sum==0)
            return 1;

        if(sum<0)
            return 0;

        if (n==0 && sum > 0)
            return 0;

        return (solveUnboundedCountSubsetSumBruteForce(coins, sum, n-1) +
                solveUnboundedCountSubsetSumBruteForce(coins, sum - coins[n-1], n)) ;

    }


    private static void printArr(int[][] dp, int r, int c) {

        for(int i=0;i<=r;i++) {
            for (int j = 0; j <= c; j++) {
                System.out.print(" " + dp[i][j]);
            }
            System.out.println();
        }
    }

}
