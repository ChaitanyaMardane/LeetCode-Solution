class Solution {
    public int countKDifference(int[] arr, int target) {
        int n = arr.length;
        int cnt=0;
        for(int i =0; i < n-1; i++){
            for( int j =i+1 ; j < n ; j++){
                if(Math.abs(arr[i]-arr[j])==target)cnt++; 
            }
        }
        return cnt;
    }
}