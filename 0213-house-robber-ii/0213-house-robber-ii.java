class Solution {
    // public int rob(int[] arr) {
    //     int n = arr.length;
    //      if (n == 1) return arr[0];
    //     int l1=linearRob(arr, 0 , n-1);
    //     int l2=linearRob(arr, 1 , n);
    //     return Math.max(l1,l2);

       
    // }
    // public int linearRob(int[] arr, int start , int end){
    //     int prev1=0;
    //     int prev2=0;
    //     for( int i = start ; i < end ; i++){
    //         int curr = Math.max(prev1 ,  arr[i]+prev2);
    //         prev2=prev1;
    //         prev1=curr;
    //     }
    //     return prev1;
    // }
      public int rob(int[] arr) {
        int n = arr.length;
        if (n == 1) return arr[0];
        return Math.max(
            solve(arr, n - 2, 0,new Integer[n]),
            solve(arr,  n - 1,1 ,new Integer[n])
        );
    }

    public int solve(int[] arr, int i, int end, Integer[] dp) {
        if (i < end) return 0;

        if (dp[i] != null) return dp[i];
        return dp[i] = Math.max(arr[i] + solve(arr, i - 2, end, dp), solve(arr, i - 1, end, dp));
    }
     
}


























































