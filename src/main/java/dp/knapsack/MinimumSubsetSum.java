package dp.knapsack;

public class MinimumSubsetSum {

    public static void main(String[] args) {

        int[] arr = {1,6,5, 11};
        int n =4;
        int sum = 0;

        for (int x: arr)
            sum+=x;

        Boolean[][] dp = new Boolean[n+1][sum/2+1];

        System.out.println(Math.abs(2*Math.abs(solveMinimumSubsetSum(dp, n, arr, sum/2))-sum));
    }

    private static int solveMinimumSubsetSum(Boolean[][] dp, int n, int[] arr, int sum) {

        for (int i = 0; i <= n; i++)
            dp[i][0] = true;
        for (int j = 1; j <= sum; j++)
            dp[0][j] = false;

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= sum; j++) {

                if (dp[i - 1][j])
                    dp[i][j] = true;
                else if (arr[i - 1] > j)
                    dp[i][j] = false;
                else dp[i][j] = dp[i - 1][j - arr[i - 1]];

            }
        }

        for(int i=sum;i>=0;i--)
            if(dp[n][i])
                return i;

        return -1;
    }

}
