class Solution {
    public static  void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int minimumSwaps(int[] arr) {
        int l =0, n = arr.length;
        int r= n-1;
        int cnt=0;
        for( ; l < r ; l++){
            if(arr[l]==0){
                while(arr[r]==0 ){
                    r--;
                    if(l>r)return cnt;
                }
                swap(arr,l,r);
                cnt++;
                r--;
            }
        }
       
        return cnt;
    }
}