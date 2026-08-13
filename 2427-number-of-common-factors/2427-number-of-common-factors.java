class Solution {
    public int commonFactors(int a, int b) {
        int cnt = 1;
        int n = a>b?b:a;
        for (int  i = 2 ; i<=n;i++){
            if(a%i==0 && b%i==0){
                cnt++;
                // if(i!=n%i)cnt++;
            }
        }
        return cnt;

        
    }
}