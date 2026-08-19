class Solution {
    public int smallestRangeI(int[] arr, int k) {
        int min=Integer.MAX_VALUE ,max=0;
        for(int x : arr){
            min=min>x?x:min;
            max=max<x?x:max;
        }
        int diff=max-min;
        if(diff%2==0){
            if((max-min)/2 <=k)return 0;
        }
        
        return diff<=2*k?0:diff -2*k;
        
    }
}