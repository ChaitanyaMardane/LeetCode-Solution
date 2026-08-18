class Solution {
    public int commonFactors(int a, int b) {
        int n = gcd(a,b);
        int ans =1;
        for (int  i = 2 ; i*i<=n;i++){
        int cnt = 1;
            while(n%i==0){
                cnt++;
                n/=i;
                // if(i!=n%i)cnt++;
            }
        ans*=cnt;
        }
        return n>1?ans*2:ans; 
    }
    public int gcd ( int a , int b ){
        return b==0?a:gcd(b,a%b);
    }
}