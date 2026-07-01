class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return  mccs(cost, n ,dp);
    }

    public int mccs(int[] cost, int id, int[] dp){
        if(id==0 || id==1) return 0; 
        if(dp[id]!=-1) return dp[id];

        return   dp[id]=Math.min(mccs( cost , id-1,dp)+cost[id-1], mccs(cost, id-2,dp)+cost[id-2]   ) ;

    }
    
}