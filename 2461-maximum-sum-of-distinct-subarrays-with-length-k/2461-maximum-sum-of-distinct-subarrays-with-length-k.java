class Solution {
    public long maximumSubarraySum(int[] arr, int k) {
        
         int n = arr.length;
        int j = 0;
        long sum=0;
        Set<Integer> set = new HashSet<>();
        long maxSum=0;
        for(int i=0; i < n ; i++){
          
            if(!set.contains(arr[i])){
                 set.add(arr[i]);
                 sum+=arr[i];
            }
            else{
               while(set.contains(arr[i])){
                sum-=arr[j];
                set.remove(arr[j++]);
               }
               set.add(arr[i]);
               sum+=arr[i];
            }
            if(i-j+1==k && set.size()==k){
              maxSum=Math.max(maxSum,sum); 
              sum-=arr[j];
              set.remove(arr[j++]);
            }
        }
        return maxSum;
    }
}