class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        Integer[][] dp = new Integer[n][n];
     return  helper(0,0,triangle, dp);
    }
    public int helper(int i,int l,List<List<Integer>> triangle, Integer[][] dp){
        if(l>=triangle.size()) return 0;
        if(dp[l][i]!=null)return dp[l][i];
        return dp[l][i]=triangle.get(l).get(i) + Math.min(helper(i,l+1,triangle,dp),helper(i+1,l+1,triangle,dp));
       
        
    }
}