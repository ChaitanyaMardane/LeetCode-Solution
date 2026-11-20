class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        return helper(0,0,m,n,dp);
    }
    public int helper(int r,int c , int m , int n, int[][] dp){
        if(r>=m || c>=n)return 0;
        if(r==m-1 && c==n-1) return 1;
        if(dp[r][c]!=0) return dp[r][c];

       return dp[r][c]= helper(r+1,c,m,n,dp)+helper(r,c+1,m,n,dp);
        
    }
}