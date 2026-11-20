class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[n][n];

        for( int j = 0 ; j < n; j++){
            dp[n-1][j]=triangle.get(n-1).get(j);
        }

        for( int l = n-2 ; l>=0; l--){
            for( int i = 0 ;i <= l ; i++){
                dp[l][i]= triangle.get(l).get(i) + Math.min(dp[l+1][i],dp[l+1][i+1]);
            }
        }

     return dp[0][0];
    }
    public int helper(int i,int l,List<List<Integer>> triangle, Integer[][] dp){
        if(l>=triangle.size()) return 0;
        if(dp[l][i]!=null)return dp[l][i];
        return dp[l][i]=triangle.get(l).get(i) + Math.min(helper(i,l+1,triangle,dp),helper(i+1,l+1,triangle,dp));
       
        
    }
}