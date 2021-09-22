package dp.longestCommonSubstring;

import java.util.Arrays;

public class MinimumNumberDeletionsToSortedSequence {

    public static void main(String[] args) {

        int[] arr = {5, 6, 1, 7, 4};
        System.out.println(minDeletions(arr, arr.length));
    }


    public static int minDeletions(int arr[], int n) {
        return n - lis(arr, n);
    }

    public static int lis(int[] arr, int n){


        int max = 0;
        int[] dp = new int[n];

        Arrays.fill(dp, 1);

        for(int i=0;i<n;i++){

            for(int j=i+1;j<n;j++){

                if(arr[j]>arr[i])
                    dp[j] = Math.max(dp[j], dp[i] + 1);

            }
            max = Math.max(dp[i], max);
        }
        return max;
    }
}
