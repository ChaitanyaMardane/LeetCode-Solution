class Solution {
    public int maxProfit( int[] nums, int[] dp, int id){
      if(id==0)return nums[0];
        if(id==1) return Math.max(nums[0] , nums[1]);
        if(dp[id]!=-1){
            return dp[id];
        }
        return dp[id]=Math.max(maxProfit(nums,dp,id-1), nums[id]+ maxProfit(nums,dp,id-2));

    }
    public int rob(int[] nums) {
        int n = nums.length;
        // return iterative(nums);
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        if( n==1) return nums[0];
        return maxProfit(nums ,dp,n-1);
        
    }
    public int iterative (int[] arr){
        int n = arr.length ;
        if(n==1)return arr[0];
        int[] dp= new  int[n];
        dp[0]=arr[0];
        dp[1]=Math.max(arr[0],arr[1]);
        for( int i = 2 ; i < n  ; i++){
            dp[i]= Math.max(dp[i-1], arr[i]+ dp[i-2]);

        }
        return dp[n-1];
    }
}