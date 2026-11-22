class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        int[][] dp = new int[n+1][m+1];
        for(int[] r : dp ){
            Arrays.fill(r,-1);
        }
        return helper(text1,text2,n,m,dp);

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