class Solution {
    public int countPrimes(int n) {
        if (n <= 2)
            return 0;
        int cnt = 0;
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);
        prime[1] = false;
        prime[0] = false;
        // for( int i =2 ; i*i < n; i+=2){
        //         while(n%i==0)n/=i;
        //         cnt++;
        // }
        // if (n>1)
        for (long i = 2; i * i <= n; i++) {
            if (prime[(int) i]) {
                for (long j = (long) i * i; j < n; j += i) {
                    prime[(int) j] = false;

                }

            }
        }
        for( int k = 2 ; k <n ;k++){
            if(prime[k])cnt++;
        }
        return cnt;
    }
    // public boolean isPrime( int n){

    //     for( int i =2 ; i*i <=n; i++){
    //         if(n%i==0)return false;
    //     }
    //     return true;
    // }
}