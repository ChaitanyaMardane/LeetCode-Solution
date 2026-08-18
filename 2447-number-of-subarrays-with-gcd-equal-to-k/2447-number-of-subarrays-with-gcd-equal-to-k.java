class Solution {
    public int subarrayGCD(int[] arr, int k) {
        int n = arr.length;
       int cnt=0;
         int g = arr[0];
            for( int i =0 ; i < n ; i++){
                g=arr[i];
                for(int j = i ;j<n;j++)
                {
                    g=gcd(g,arr[j]);
                    
                if (g < k || g % k != 0) 
                    break;
              
                    if(g==k)cnt++;
                }
            }
             System.out.println(cnt);

            return cnt;
        
       
    }
    public int gcd(int a , int b){
        while (b!=0){
            int r = a%b;
            a=b;
            b=r;
        }
        return a;
    }

    
    
}