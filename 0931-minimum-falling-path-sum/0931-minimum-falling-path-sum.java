class Solution {
 public int minFallingPathSum(int[][] matrix) {
    int n = matrix.length;
    int minimum = Integer.MAX_VALUE;
    Integer[][] dp = new Integer[n][n];
    

    for (int c = 0; c < n; c++) {
        minimum = Math.min(minimum, helper(n - 1, c, matrix,dp) );
    }

    return minimum;
}

public int helper(int r, int c, int[][] grid, Integer[][] dp ) {

    if (c < 0 || c >= grid[0].length) {
        return (int) 1e9;
    }

    if (r == 0) {
        return grid[0][c];
    }
    if(dp[r][c] != null ) return dp[r][c];

    int up = helper(r - 1, c, grid,dp);
    int leftDiagonal = helper(r - 1, c - 1, grid,dp);
    int rightDiagonal = helper(r - 1, c + 1, grid,dp);

    return dp[r][c] =grid[r][c] +
             Math.min(up, Math.min(leftDiagonal, rightDiagonal));
    }
}