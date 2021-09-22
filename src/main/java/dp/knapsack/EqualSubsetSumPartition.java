package dp.knapsack;

public class EqualSubsetSumPartition {

    public static void main(String[] args) {

        int[] posArr = {2,4,11, 10, 5};
        int sum = 0;
        int n = 5;

        for (int x: posArr)
            sum+=x;

        if((sum&1)==0){
            Boolean[][] dp = new Boolean[n+1][sum/2+1];

            System.out.println(solveEqualSubsetSumPartitionTopDown(n, posArr, sum/2, dp));
            System.out.println(solveEqualSubsetSumPartitionBottomUp(n, posArr, sum/2));
        }
        else
            System.out.println(false);
    }

    /*  arr  1 5 2 4

         0 1 2 3 4 wt
     n 0 t f f f f
     1 1 t t f f f
     5 2 t t f f f
     2 3 t t t t f
     */

    private static boolean solveEqualSubsetSumPartitionBottomUp(int n, int[] posArr, int sum) {

        boolean[][] dp = new boolean[n + 1][sum + 1];

        for (int i = 0; i <= n; i++)
            dp[i][0] = true;

        for (int i = 1; i <= sum; i++)
            dp[0][i] = false;

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= sum; j++) {

                if (dp[i - 1][j])
                    dp[i][j] = true;
                else if (posArr[i - 1] > j)
                    dp[i][j] = false;
                else dp[i][j] = dp[i - 1][j - posArr[i - 1]];
            }
        }

        return dp[n][sum];

    }

    private static boolean solveEqualSubsetSumPartitionTopDown(int n, int[] posArr, int sum, Boolean[][] dp) {

        if (sum==0)
            return true;
        if(n==0)
            return false;
        if(dp[n][sum]==null) {
            if (posArr[n - 1] <= sum) {

                dp[n][sum] = solveEqualSubsetSumPartitionTopDown(n - 1, posArr, sum - posArr[n - 1], dp) ||
                        solveEqualSubsetSumPartitionTopDown(n - 1, posArr, sum, dp);
            }
            else dp[n][sum] = false;

            return dp[n][sum];
        }
        else
        return dp[n][sum];

    }
}