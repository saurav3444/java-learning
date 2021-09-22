package dp.longestCommonSubstring;

public class MaxSumIncreasingSubsequence {

    public static void main(String[] args) {

        int[] arr = {1, 101, 2, 3, 100} ;

        System.out.println(lis(arr, arr.length));
    }

    private static int lis(int[] a, int n) {

        if (n <= 1)
            return a[0];

        int[] dp = new int[n];

        for(int i=0;i<n;i++)
            dp[i] = a[i];

        int max = dp[0];


        for (int i = 0; i < n; i++) {

            for (int j = i+1; j < n; j++) {

                if (a[j] > a[i]) {

                    dp[j] = Math.max(dp[i] + a[j], dp[j]);

                    max = Math.max(max, dp[j]);


                }
            }
        }

        return max;
    }
}
