package dp.unboundedKnapsack;

import java.util.Arrays;

public class RodCutting {

    public static void main(String[] args) {

        int n = 7;
        int[] arr = {5, 5, 2};

        int count = countMaxRodCuts(n, arr);
        System.out.println(count);
    }

    public static int countMaxRodCuts(int sum, int[] arr){

        int[] countTable = new int[sum+1];
        Arrays.fill(countTable, 0);
        countTable[0] = 0;
        for(int i=0;i<arr.length;i++)
            countTable[arr[i]]=1;

        for(int i=0;i<arr.length;i++){
            for(int j=arr[i];j<=sum;j++){
                if(countTable[j-arr[i]]!=0)
                    countTable[j] = (countTable[j]>=countTable[j-arr[i]]+1)?
                                countTable[j]:countTable[j-arr[i]]+1;
            }
        }


        return countTable[sum];

    }
}
