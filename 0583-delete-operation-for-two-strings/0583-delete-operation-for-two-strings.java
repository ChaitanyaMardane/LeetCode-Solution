class Solution {
    public int minDistance(String x, String y) {
        int m = x.length();
        int n = y.length();
        int[][] dp = new int[m+1][n+1];
        for(int[] r : dp){
            Arrays.fill(r,-1);
        }
        int lcs = helper(m,n,x,y,dp);
        return m+n-2*lcs;
        
    }
    public int helper(int m , int n  , String x , String y , int[][] dp){
        if(m==0 || n==0) return 0;
        if(dp[m][n]!=-1) return dp[m][n];
        if(x.charAt(m-1)==y.charAt(n-1)){
           return  dp[m][n] = 1+ helper(m-1,n-1,x,y,dp);
        }
        return dp[m][n] = Math.max( helper(m,n-1,x,y,dp),  helper(m-1,n,x,y,dp));
    }
}