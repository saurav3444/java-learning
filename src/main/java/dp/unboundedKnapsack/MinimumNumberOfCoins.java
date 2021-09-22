package dp.unboundedKnapsack;

import java.util.Arrays;

/*

   min number of coins to make target
        https://www.youtube.com/watch?v=Y0ZqKpToTic
        min( dp[i-1][j], dp[i-1][j-arr[i]] + 1)


 */

public class MinimumNumberOfCoins {
    public static void main(String[] args) {
        int[] arr = {25, 10, 5};
        int n = 3;
        int sum = 30;

        int count = minCoins(arr, n, sum);
        System.out.println(count);
    }
    public static int minCoins(int arr[], int n, int sum)
    {
        int[] table = new int[100000];

        Arrays.fill(table, 0);
        for(int i=0;i<n;i++)
            table[arr[i]] = 1;

        for(int i=0;i<n;i++)
        {
            for(int j=arr[i];j<=sum;j++){

                if(table[j-arr[i]]!=0){

                    if(table[j]==0)
                        table[j] = table[j-arr[i]]+1;
                    else
                        table[j] = (table[j]<=table[j-arr[i]]+1)?
                                table[j]:table[j-arr[i]]+1;


                }
            }
        }

        return (table[sum]==0)?-1:table[sum];
    }
}
