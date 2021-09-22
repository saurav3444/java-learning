package dp.palindromicSubsequence;

public class LongestPalindromicSubsequence {

    public static void main(String[] args) {

        String str = "geeksforgeeks";

        System.out.println(lps(str));
    }

    private static int lps(String str) {

        int n = str.length();
        int[][] dp = new int[n][n];

        int k = 0;
        int r, c;
        int max = 0;

        while(k<n){

            r = 0;
            c = k;

            while(c<n){

                if(r==c)
                    dp[r][c] = 1;
                else if(c-r==1){
                    if(str.charAt(c)==str.charAt(r))
                        dp[r][c] = 2;
                    else
                        dp[r][c] = 1;
                }
                else {

                    if (str.charAt(c) == str.charAt(r))
                        dp[r][c] = dp[r + 1][c - 1] + 2;
                    else
                        dp[r][c] = Math.max(dp[r + 1][c], dp[r][c - 1]);
                }

                max = Math.max(max, dp[r][c]);
               r++; c++;
            }
            k++;
        }

        return max;
    }

}
