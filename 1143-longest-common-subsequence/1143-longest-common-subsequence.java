class Solution {
    public int longestCommonSubsequence(String x, String y) {
        int n=x.length();
        int m=y.length();
        int[][] dp = new int[n+1][m+1];
        for( int i = 0 ; i < dp.length ;i++)dp[i][0]=0;
        for( int i = 1 ; i < dp[0].length ;i++)dp[0][i]=0;

        for( int i = 1 ; i <= n ; i++){
            for( int j = 1 ; j <= m; j++){
                if(x.charAt(i-1)==y.charAt(j-1)){
                    dp[i][j]= 1 + dp[i-1][j-1];
                 
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[n][m];

        // for(int[] r : dp ){
        //     Arrays.fill(r,-1);
        // }
        // return helper(text1,text2,n,m,dp);

    }
    public int helper(String x, String y , int n , int m, int[][] dp ){
        if(n==0  || m==0 ) return 0;
        if(dp[n][m]!=-1) return dp[n][m]; 
        if(x.charAt(n-1)==y.charAt(m-1)){
            return dp[n][m]=1 + helper(x,y,n-1,m-1,dp);
        }
        return dp[n][m] =Math.max(helper(x,y,n,m-1,dp),helper(x,y,n-1,m,dp));

    }
}