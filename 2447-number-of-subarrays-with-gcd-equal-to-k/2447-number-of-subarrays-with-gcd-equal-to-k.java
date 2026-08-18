class Solution {
    public int subarrayGCD(int[] arr, int k) {
        int n = arr.length;
       int cnt=0;
         int g = arr[0];
            for( int i =0 ; i < n ; i++){
                g=arr[i];
                for(int j = i ;j<n;j++)
                {g=gcd(g,arr[j]);
                if(g==k)cnt++;}
            }
             System.out.println(cnt);

            return cnt;
        
        //    return  count(arr,k);
       
    }

    public int gcd(int a , int b){
        return b==0?a:gcd(b,a%b);
    }
    public int fact(int n){
        if(n<=1)return n;
        return n*fact(n-1);
    }
    public int count(int[] arr,int k){
         int ans=0;
         int n =arr.length;
        for(int j = 0 ; j <n;j++){
            int cnt = 0;
            while(j<n && arr[j]!=1){
                cnt++;
                j++;
            }

            ans+=fact(cnt);

        }
        return ans;
    }
    
}