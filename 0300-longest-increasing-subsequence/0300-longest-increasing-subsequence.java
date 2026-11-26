class Solution {
    public int lengthOfLIS(int[] arr) {
        int n = arr.length;
        int[][] dp = new int[n][n+1];
        for(int[] r : dp){
            Arrays.fill(r, -1);
            
        }

        return printSubseq(0,-1, arr,dp);
    }

    public static int printSubseq(int n, int prev, int[] arr,int[][] dp) {
        if (n == arr.length)
            return 0;

        if(dp[n][prev+1]!=-1) return dp[n][prev+1];
        int pick = 0;
        if (prev == -1 || arr[n] > arr[prev]) {
            pick = 1 + printSubseq(n + 1, n, arr,dp);
        }
        return dp[n][prev+1]=Math.max(pick, printSubseq(n + 1, prev, arr,dp));

    }
}