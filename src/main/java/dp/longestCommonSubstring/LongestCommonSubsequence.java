package dp.longestCommonSubstring;

public class LongestCommonSubsequence
{
    public static void main(String[] args) {
        String str1  = "ABCDGH";
        String str2 = "AEDFHR";

        System.out.println(lcs(str1, str2));
    }
    public static int lcs(String str1, String str2)
    {
        int[][] dp = new int[str1.length()+1][str2.length()+1];
        int r = str1.length();
        int c = str2.length();
        int max = 0;


        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){

                if(str1.charAt(i-1)==str2.charAt(j-1))
                    dp[i][j] = dp[i-1][j-1] + 1;
                else
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);

                max = Math.max(dp[i][j], max);
            }
        }
        
        return max;
    }

}