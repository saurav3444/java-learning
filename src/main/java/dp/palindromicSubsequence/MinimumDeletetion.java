package dp.palindromicSubsequence;

public class MinimumDeletetion {

    public static void main(String[] args) {

        String str = "geeksforgeeks";

        System.out.println(minDel(str));
    }

    private static int minDel(String str) {

        int n = str.length();
        int[][] dp = new int[n][n];

        int k =0 ;
        int i, j, max = 0;

        while(k<n){

            i=0; j=k;

            while(j<n){

                if(j==i)
                    dp[i][j] = 1;
                else if(j-i==1) {
                        if (str.charAt(i) == str.charAt(j))
                            dp[i][j] = 2;
                        else
                            dp[i][j] = 1;
                    }
                else{

                    if(str.charAt(i) == str.charAt(j)){
                        dp[i][j] = dp[i+1][j-1] + 2;
                    }else
                        dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1]);
                }

                max = Math.max(dp[i][j], max);
                i++;j++;
            }
            k++;
        }

        return n-max;
    }
}
