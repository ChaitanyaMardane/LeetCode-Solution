class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        
          int[][] dp = new int[m][n];
        
        return helper(m-1,n-1,grid,dp);
    }
    public int helper(int r,int c ,int[][] grid, int[][] dp){
        if(r==0 &&c==0) return grid[r][c];
        if(r<0 || c<0) return (int)(1e9);
        if(dp[r][c]!=0) return dp[r][c];
        
        

        return dp[r][c]= grid[r][c]+ Math.min(helper(r-1,c,grid,dp),helper(r,c-1,grid,dp));
        
        
    }
}