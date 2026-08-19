class Solution {
    public double myPow(double x, int n) {
        if(n==0)return 1;
        long N=n;
    if(n<0){
        N=N*-1;
        x=1/x;
    }
    
    double a=x;
    System.out.println(n);
    return pow(a,N);
    }
    public double pow(double a, long b){
        if(b==0)return 1;
        if(b==1) return a;
        
        if(b%2==0){
           double ans = pow(a,b/2);
           return ans*ans;
        }
        else{
            double ans = pow(a,(b-1)/2);
            return ans*ans*a;
        }
    
    }
}
