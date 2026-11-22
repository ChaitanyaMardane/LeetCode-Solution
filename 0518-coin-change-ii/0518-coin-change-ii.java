class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int[][] dp = new int[n+1][amount+1];
        for(int[] r : dp){
            Arrays.fill(r,-1);
        }
        return helper(coins.length, coins , amount,dp);
        
    }
    public int helper(int n , int[] coins , int amount,int[][] dp){
        if(amount==0) return 1;
        if(n==0) return 0;
        if(dp[n][amount]!=-1)return dp[n][amount];
        int notPick = helper(n-1,coins,amount,dp);
        int pick =0;
        if(amount>=coins[n-1]){
            pick = helper(n,coins,amount-coins[n-1],dp);
        }
        return dp[n][amount]=pick+notPick;
    }
}