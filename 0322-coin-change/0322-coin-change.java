class Solution {
    public int coinChange(int[] coins, int amount) {
        int cnt = coins.length;
        int[][] dp = new int[cnt+1][amount+1];
        for(int[] r : dp){
            Arrays.fill(r,-1);
        }
        int ans =helper(coins.length,coins,amount,0,dp);
        return ans>=(int)1e9?-1:ans;
    }
    public int helper(int  n , int[] coins , int amount,int cnt,int[][] dp){
        if(amount==0) return 0;
        if(n==0)return (int)1e9;
        if(dp[n][amount]!=-1)return dp[n][amount];

        if(amount>=coins[n-1]){
            return dp[n][amount]=Math.min(1+helper(n,coins,amount-coins[n-1],cnt+1,dp),helper(n-1,coins,amount,cnt,dp));
        }
        return dp[n][amount]=helper(n-1,coins,amount,cnt,dp);
    }

}