package dp.longestCommonSubstring;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

    public static void main(String[] args) {

        int[] arr = {0,8,4,12,2,10,6,14,1,9,5,13,3,11,7,15};

        System.out.println(lis(arr, arr.length));
    }

    private static int lis(int[] a, int n) {

            if(n<=1)
                return n;

            int[]dp = new int[n];
            Arrays.fill(dp, 1);
            int max = 0;

            for(int i=0;i<n;i++){

                for(int j=i;j<n;j++){

                    if(a[j]>a[i]){
                        dp[j]=Math.max(dp[i]+1, dp[j]);
                        max = Math.max(max, dp[j]);
                    }
                }
            }

            return max;
    }


}
