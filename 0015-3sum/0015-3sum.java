class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);
        for(int x: arr){
            System.out.print(x+" ");
        }
        // arr.stream().forEach((x)->System.out.println(x));
        Set<List<Integer>> ans = new HashSet<>();
        int n = arr.length;
        for( int i= 0 ; i < n-1 ; i++){
            int l = i+1;
            int r = n-1;
            while(l<r){
                int sum = arr[i]+arr[l]+arr[r];
                if(sum==0){
                    ans.add(Arrays.asList(arr[i],arr[l],arr[r]));
                    l++;r--;
                    continue;
                    
                }
                if(sum>0)r--;
                else l++;
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        ans.stream().forEach((x)->{ 
            result.add(x);
        });
        
        return result;
        
    }
}