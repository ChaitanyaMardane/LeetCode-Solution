class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        int[] hash = new int[101];
        for(int x : nums){
            hash[x]++;
        }
        for( int x: hash){
            if(x!=0){
                if(isPrime(x)) return true;
            }
        }
        return false;
    }
    public  boolean isPrime(int n){
        if(n==1) return false;
        if(n==2) return true;
    if(n%2==0) return false;
    for( int  i =3; i*i <= n ; i++){
        if(n%i==0) return false;
    }
    return true;

    }
}