class Solution {
    public int uniquePaths(int m, int n) {
        // int[][] dp = new int[m][n];
        int[] prev = new int[n+1];
        int[] curr = new int[n+1];
 
        Arrays.fill(prev,1);
        // curr[0]=1;
        
        for( int i = 1 ; i <m ; i++){
            curr[0]=1;
            for(int j = 1 ;j <n ; j++){
                curr[j]= prev[j]+curr[j-1];

            }
            System.out.println(Arrays.toString(curr));
            prev= curr;
            curr = new int[n+1];
        }
        return prev[n-1];
        
        // return helper(0,0,m,n,dp);
    }
    public int helper(int r,int c , int m , int n, int[][] dp){
        if(r>=m || c>=n)return 0;
        if(r==m-1 && c==n-1) return 1;
        if(dp[r][c]!=0) return dp[r][c];

       return dp[r][c]= helper(r+1,c,m,n,dp)+helper(r,c+1,m,n,dp);
        
    }
}