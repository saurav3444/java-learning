package dp.palindromicSubsequence;

public class LongesPalindromicSubstring {

    public static void main(String[] args) {

        String str = "aaaabbaa";

        System.out.println(lps(str));
    }

    private static String lps(String str) {

        int n = str.length();
        if(n<=1)
            return str;
        int[][] dp = new int[n][n];
        int i = 0, j=0, max = 0;
        int k = 0;

        while(k!=n){

            int r = 0, c = k;

            while(c<n){

                if(r==c)
                    dp[r][c] = 1;
                else {
                    final var charAtREqualsC = str.charAt(r) == str.charAt(c);

                    if(c-r==1){
                        if(charAtREqualsC) {
                            dp[r][c] = 1;

                        }
                    }
                    else  if(charAtREqualsC && dp[r+1][c-1]==1){
                        dp[r][c] = 1;

                    }
                    else
                        dp[r][c] = 0;

                }
                if(dp[r][c]==1){

                    if(max<c-r+1){
                        i = r;
                        j= c;
                    }
                }

                r++; c++;
            }

            k++;
        }


        return str.substring(i);
    }
}
