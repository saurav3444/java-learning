package dp.knapsack;

public class CountOfSubsetSum {

    private static int count = 0;

    public static void main(String[] args) {

        int[] arr = {1,2,3,3};
        int sum = 6;
        int n = arr.length;

        solveCountOfSubsetSumBruteTopDown(n, arr, sum);
        System.out.println(count);
        solveCountOfSubsetBottomUp(n, arr, sum);

    }

    private static void solveCountOfSubsetBottomUp(int n, int[] arr, int sum) {

        int[][] dp = new int[n+1][sum+1];

        for(int i=0;i<=n;i++)
            dp[i][0]=1;
        for (int j=1;j<=sum;j++)
            dp[0][j]=0;

        for(int i=1;i<=n;i++)
            for(int j=1;j<=sum;j++){

                if(arr[i-1]>j)
                    dp[i][j] = dp[i-1][j];
                else
                    dp[i][j] = dp[i-1][j] + dp[i-1][j-arr[i-1]];
            }
        System.out.println(dp[n][sum]);
    }

    private static void solveCountOfSubsetSumBruteTopDown(int n, int[] arr, int sum) {

        if(sum==0)
            count++;

        if(n==0)
            return;

        if(sum>=arr[n-1])
            solveCountOfSubsetSumBruteTopDown(n-1, arr, sum-arr[n-1]);
        else
        solveCountOfSubsetSumBruteTopDown(n-1, arr, sum);

    }
}
