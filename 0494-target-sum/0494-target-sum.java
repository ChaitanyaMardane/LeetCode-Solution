class Solution {
    public int findTargetSumWays(int[] arr, int target) {
        int n = arr.length;
        int sum = 0;
        for(int x : arr){
            sum+=x;
        }
      
    if (sum < Math.abs(target)) return 0;

    if ((sum - target) % 2 != 0) return 0;

    int nt = (sum - target) / 2;

    int[][] dp = new int[n + 1][nt + 1];

    for (int[] row : dp) {
        Arrays.fill(row, -1);
    }
    return countSubset(n,nt,arr,dp);

        
    }

 public static int countSubset(
    int n, int target, int[] arr, int[][] dp
) {
        // No elements remaining
        if (n == 0) {
            return target == 0 ? 1 : 0;
        }

        if (dp[n][target] != -1) {
            return dp[n][target];
        }

        int notPick = countSubset(n - 1, target, arr, dp);

        int pick = 0;

        if (target >= arr[n - 1]) {
            pick = countSubset(n - 1, target - arr[n - 1], arr, dp);
        }

        return dp[n][target] = pick + notPick;
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