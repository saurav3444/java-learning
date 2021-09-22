package dp.longestCommonSubstring;

class LongestCommonSubstring {
    public static void main(String[] args) {
        String str  = "ABCDGH";
        String substr = "ACDGHR";

        System.out.println(longestCommonSubstr(str, substr));
    }
    static int longestCommonSubstr(String str, String substr){
        
        int[][] dp = new int[str.length()+1][substr.length()+1];
        int r= str.length();
        int c = substr.length();
        System.out.println();

        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){

                if(str.charAt(i-1)==substr.charAt(j-1))
                    dp[i][j] = dp[i-1][j-1] + 1;
                else
                    dp[i][j] = 0;
            }
        }

        return dp[r][c];

    }
}