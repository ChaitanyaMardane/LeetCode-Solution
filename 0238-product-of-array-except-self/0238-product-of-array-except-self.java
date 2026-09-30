class Solution {
    public int[] productExceptSelf(int[] arr) {
        int n = arr.length;
        if(n==1)return arr;
        
        int[] preProd =new int[n];
        int[] sufProd =new int[n];

        preProd[0]=arr[0];
        sufProd[n-1]=arr[n-1];
        for( int i = 1 ; i < arr.length; i++){
            preProd[i]=preProd[i-1]*arr[i];
         }
        for( int i = n-2 ; i >= 0; i--){
            sufProd[i]=sufProd[i+1]*arr[i];
        }
        int[] ans = new int[n];
        ans[0]=sufProd[1];
        ans[n-1]=preProd[n-2];

        for(int i =1; i< n-1  ;i++){
            int l = preProd[i-1];
            int r = sufProd[i+1];
            ans[i]=l*r;
        }
        return ans;
    }
}