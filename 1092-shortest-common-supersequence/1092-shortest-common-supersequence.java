class Solution {
    public String shortestCommonSupersequence(String x, String y) {
        int m = x.length();
        int n = y.length();
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (x.charAt(i - 1) == y.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        int i = m;
        int j = n;
        int cnt = dp[m][n];
        char[] ans = new char[m + n - cnt];
        cnt = ans.length;

        while (i > 0 && j > 0) {
            if (x.charAt(i - 1) == y.charAt(j - 1)) {

                ans[--cnt] = x.charAt(i - 1);
                i--;
                j--;
            } else {
                if (dp[i - 1][j] > dp[i][j - 1]) {
                    ans[--cnt] =  x.charAt(i - 1);
                    i--;
                } else {
                    ans[--cnt] =y.charAt(j - 1);
                    j--;
                }
            }
        }
         while (i >0) {
           ans[--cnt]=x.charAt(i-1);
           i--;
        }
        while (j >0) {
            ans[--cnt]=y.charAt(j-1);
            j--;
        }

        return new String(ans);
        // cnt = 0;
        // i = 0;
        // j = 0;
        // StringBuilder sb = new StringBuilder();
        // while (i < m && j < n && cnt < ans.length) {
        //     if (x.charAt(i) == y.charAt(j)) {
        //         sb.append(x.charAt(i));
        //         cnt++;
        //         i++;
        //         j++;
        //     } else {
        //         if(x.charAt(i)==ans[cnt]){
        //             sb.append(y.charAt(j++));
        //         }else if(y.charAt(j)==ans[cnt]){
        //             sb.append(x.charAt(i++));
        //         }
        //         else{
        //             sb.append(x.charAt(i++));
        //             sb.append(y.charAt(j++));
        //         }

        //         // while (ans[cnt] == x.charAt(i) && ans[cnt] != y.charAt(j)) {
        //         //     sb.append(y.charAt(j));
        //         //     j++;
        //         // }
        //         // while (ans[cnt] == y.charAt(j) && ans[cnt] != x.charAt(i)) {
        //         //     sb.append(x.charAt(i));
        //         //     i++;
        //         // }
        //         // if (ans[cnt] != y.charAt(j) && ans[cnt] != x.charAt(i)) {
        //         //     sb.append(x.charAt(i++));
        //         //     sb.append(y.charAt(j++));
        //         // }
        //     }

        // }
        // while (i < m) {
        //     sb.append(x.charAt(i));
        //     i++;
        // }
        // while (j < n) {
        //     sb.append(y.charAt(j));
        //     j++;
        // }

        // return sb.toString();
    }
}