class Solution {
    public boolean canPartition(int[] arr) {
         int n = arr.length;
         int target =0;
         for(int x:arr){
            target+=x;
         }
         if(target%2!=0)return false;
        Boolean[][] dp = new Boolean[n+1][target+1];
             return countSubset(n-1,target/2,arr,dp);
         }
  public static boolean countSubset(int  n , int target , int[] arr,Boolean[][] dp){
        if(target==0) return true;

     if (n == 0) {

        return false;
     }
      
      if(dp[n][target] != null) return dp[n][target];
      if(target >= arr[n]){
          return dp[n][target] =   countSubset(n-1, target- arr[n], arr,dp) || countSubset(n-1, target, arr,dp);
      }
      return dp[n][target] =countSubset(n-1, target, arr,dp);
  }
    
}