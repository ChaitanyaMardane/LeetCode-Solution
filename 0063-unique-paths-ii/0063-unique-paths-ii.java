class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
            int m= grid.length;
            int n = grid[0].length;
           int[][] dp =new  int[m][n];
        
        return helper(0,0,m,n,grid,dp);
    }
    public int helper(int r,int c , int m , int n,int[][] grid, int[][] dp){
        if(r>=m || c>=n )return 0;
        if(grid[r][c]==1)return 0;
        if(r==m-1 && c==n-1) return 1;
        if(dp[r][c]!=0) return dp[r][c];

       return dp[r][c]= helper(r+1,c,m,n,grid,dp)+helper(r,c+1,m,n,grid,dp);
        
    }
}