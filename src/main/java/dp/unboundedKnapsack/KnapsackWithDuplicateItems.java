package dp.unboundedKnapsack;

import static java.lang.Math.max;

public class KnapsackWithDuplicateItems {

    public static void main(String[] args) {


        int[] weight = {1,2};
        int[] value = {2,1};
        int maxWt = 3;
        int n = weight.length;

        double[] valPerWt = new double[n];

        int[][] dp = new int[n+1][maxWt+1];

        System.out.println(solveKnapsackWithDuplicateItems(weight, value, maxWt, n, dp));

    }

    public static int solveKnapsackWithDuplicateItems(int[] wt, int[] val, int Wt, int n, int[][] dp){

        if(dp[n][Wt]!=0)
            return dp[n][Wt];

        if(n==0 || Wt==0)
            return 0;

        if(Wt-wt[n-1]>=0)
            return dp[n][Wt] =  max( val[n-1] + solveKnapsackWithDuplicateItems( wt, val, Wt-wt[n-1], n, dp),
                    solveKnapsackWithDuplicateItems( wt, val, Wt, n-1, dp));
        else
            return  dp[n][Wt] = solveKnapsackWithDuplicateItems(wt, val, Wt, n-1, dp);
    }

}
