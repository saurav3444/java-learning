package dp.knapsack;

public class SubsetSum {

    public static void main(String[] args) {

        int[] arr = {2,3,1,5};
        int n = arr.length;
        int target = 6;

        System.out.println(solveSubsetSum(arr, n, target));

    }

    private static int solveSubsetSum(int[] arr, int n, int target) {

        int[][] dp = new int[n+1][target+1];

        for(int i=0;i<=n;i++)
            dp[i][0] = 1;

        for(int j=1;j<=target;j++)
            dp[0][j]=0;

        for(int i=1;i<=n;i++)
            for(int j=1;j<=target;j++){

                if(dp[i-1][j]==1)
                    dp[i][j]= 1;
                else if(j>=arr[i-1])
                    dp[i][j] = dp[i-1][j-arr[i-1]];
                else
                    dp[i][j] = dp[i-1][j];
            }

        return dp[n][target];
    }

}
