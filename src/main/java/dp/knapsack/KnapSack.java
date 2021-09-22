package dp.knapsack;

import static java.lang.Math.max;

public class KnapSack {

    public static int solveKnapsacK(int[] wt, int[] val, int Wt, int n, int[][] dp){

        if(dp[n][Wt]!=0)
            return dp[n][Wt];

        if(n==0 || Wt==0)
            return 0;

        if(Wt-wt[n-1]>=0)
            return dp[n][Wt] =  max( val[n-1] + solveKnapsacK( wt, val, Wt-wt[n-1], n-1, dp),
                     solveKnapsacK( wt, val, Wt, n-1, dp));
        else
            return  dp[n][Wt] = solveKnapsacK(wt, val, Wt, n-1, dp);
    }

    public static void main(String[] args) {

        int n = 4;
        int[] weight = {1,3,5,6};
        int[] value = {100, 32, 3, 4};
        int maxWt = 5;
        int[][] dp = new int[n+1][maxWt+1];

        System.out.println(solveKnapsacK(weight, value, maxWt, n, dp));

    }

}
