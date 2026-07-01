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
    // public int mccs(int[] cost ,  int id , int[] dp){
    //     if(id == 0 || id==1)return cost[id];
    //     if(dp[id]!=-1) return dp[id];
    //    return dp[id]= cost[id] + Math.min(mccs(cost , id-1,dp),mccs(cost ,  id-2,dp));
       
        
    // }
    //   public int minCostClimbingStairs(int[] cost) {
    //     int n = cost.length;
    //     int[] dp = new int[n+1];
    //     dp[0]=0;
    //     dp[1]=0;
    //     for( int i = 2 ; i <=n ; i++){
    //         dp[i]= Math.min(dp[i-1] + cost[i-1], cost[i-2]+dp[i-2]);
    //     }
    //   return dp[n];
        
    // }
}