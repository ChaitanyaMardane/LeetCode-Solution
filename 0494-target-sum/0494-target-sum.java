class Solution {
    public int findTargetSumWays(int[] arr, int diff) {
         int n = arr.length;

         int sum = 0 ;
         for (int x  : arr) {
             sum+=x;
         }
         
         // diff = s1-s2  
         // range = s1 + s2-> diff + 2*s2
         // therefore  diff = range - 2*s2;
         // if we consider mod  of s1-s2 
         // diff = range - 2*s1
         // so  2* s1 = range - diff or 2*s2 = range - diff 
         // therefore  range - diff has to be even;
         if(Math.abs(diff)> sum) return 0;
         if((sum-Math.abs(diff))%2!=0)return 0;
         // finding the count of s2 return the count of partisions 
         int target = Math.abs((sum-diff))/2;
         Integer[][] dp = new Integer[n+1][target+1];
         return countSubset(n, target, arr, dp);

     }

 public static int countSubset(int  n , int target , int[] arr,Integer[][] dp){
     if(n==0) return target==0?1:0;
     if(dp[n][target] != null) return dp[n][target];
     if(target >= arr[n-1]){
         return dp[n][target] =   countSubset(n-1, target- arr[n-1], arr,dp) + countSubset(n-1, target, arr,dp);
     }
     return dp[n][target] =countSubset(n-1, target, arr,dp);
 }

    // public static int helper(int[] arr, int target, int n , int sum ){
      
    //         System.out.println(count);

    //     if(n==0){
    //           if(sum==target ){
    //         // System.out.println(count);
    //         count++;
    //     }
    //         return count;
    //     }
        


    //   return   helper(arr,target,n-1, sum+arr[n-1])+helper(arr,target,n-1, sum-arr[n-1]);
    // }
}
    //     int cnt=0;
    //     for( int i = 0 ;i <= sum;i++){
    //     System.out.println(target+" "+cnt+" "+Math.abs(sum - 2*i));

    //         int count =countSubset(n,i,arr,dp);
    //         if(count>0){
    //             if(Math.abs(sum-2*i)==target) cnt+=count;
    //         }
    //     }
    //  return cnt;