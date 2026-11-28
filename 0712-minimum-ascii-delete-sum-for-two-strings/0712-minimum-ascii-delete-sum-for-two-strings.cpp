class Solution {
public:
    int minimumDeleteSum(string s1, string s2) {
        int m = s1.size();
        int n = s2.size();
        vector<vector<int>> dp(m+1, vector<int>(n+1,0));
        for( int i = 1 ; i <= m ; i++){
            dp[i][0]=dp[i-1][0]+s1[i-1];
        }
          for( int i = 1 ; i <= n ; i++){
            dp[0][i]=dp[0][i-1]+s2[i-1];
        }
        for( int i = 1 ; i <=m ; i++){
            for( int j = 1 ; j <=n ; j++){
                if(s1[i-1]==s2[j-1]){
                    dp[i][j]= dp[i-1][j-1];
                }else{
                    dp[i][j]=min(dp[i-1][j]+s1[i-1],dp[i][j-1]+ s2[j-1]);
                }
            }

        }
        return dp[m][n];

        // return solve(m,n,s1,s2,dp);
    }
    // int solve(int m , int n , string x , string y , vector<vector<int>>& dp){
    //     if(m==0 && n==0) return 0;
    //     if(dp[m][n]!=-1) return dp[m][n];
    //     if(m==0) return y[n-1]+ solve(m,n-1,x,y,dp);
    //     if(n==0) return x[m-1] + solve(m-1,n,x,y,dp);
    //     if(x[m-1]==y[n-1]){
    //         return dp[m][n]= solve(m-1,n-1,x,y,dp);
    //     }
    //     return dp[m][n]= min(solve(m,n-1,x,y,dp)+y[n-1],solve(m-1,n , x,y,dp)+x[m-1]);
    // }
};