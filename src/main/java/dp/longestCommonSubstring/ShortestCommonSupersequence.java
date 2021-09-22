package dp.longestCommonSubstring;

class ShortestCommonSupersequence
{
    public static int[][] dp;

    public static void main(String[] args) {

        String s1 = "hxmngqmf";
        String s2 = "gnapcnty";

        System.out.println(shortestCommonSupersequence(s1, s2, s1.length(), s2.length()));
    }
    public static int shortestCommonSupersequence(String X,String Y,int m,int n)
    {
        int[] rc = lcs(X,Y,m,n);

        return m + n - rc[2]; 

    }
    
    public static String lcsStr(int[] rc, String s1, String s2){
        
        String s = "" + s1.charAt(rc[0]);
        int min = rc[2];
        int i = rc[0];
        int j = rc[1];
        
        while(min>1){
            
            if(dp[i][j]==dp[i-1][j-1]+1){
                min = dp[i-1][j-1];
                s+=s1.charAt(i-1);
            }else if(dp[i-1][j]>dp[i][j-1])
            {
                min = dp[i-1][j];
                s+=s1.charAt(i-1);
            }else{
                min = dp[i][j-1];
                s+=s1.charAt(i);
            }
        }
        System.out.print(s);
        return s;
        
    }
    
    public static int[] lcs(String s1, String s2, int m, int n){
        
        dp = new int[m+1][n+1];
        
       /* for(int i=0;i<m;i++){
            if(s2.charAt(0)==s1.charAt(i))
                dp[i][0] = 1;
            else 
            if(i>0)
                dp[i][0] = dp[i-1][0];
        }
        
        for(int i=0;i<n;i++){
            if(s1.charAt(0)==s2.charAt(i))
                dp[0][i] = 1;
            else 
            if(i>0)
                dp[0][i] = dp[0][i-1];
        }*/
            
        int[] rcm = new int[3];
        int max = 0;
        
        for(int i=1;i<=m;i++)
         for(int j=1;j<=n;j++){
             
             if(s1.charAt(i-1)==s2.charAt(j-1)){
                 
                 dp[i][j] = dp[i-1][j-1] + 1;
             }
             else
             {
                 dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
             }
             
             if(max<dp[i][j]){
                 rcm[0] = i;
                 rcm[1] = j;
                 max = dp[i][j];
                 rcm[2] = max;
             }
             
         }
         System.out.println();
         return rcm;
    }
    
    public static void printarr(int[][] dp ,int m, int n){
        
        for(int  i=0;i<m;i++){
            System.out.println();
            for(int j=0;j<n;j++)
                System.out.print(dp[i][j] + " ");
        }
    }
}