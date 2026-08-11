class Solution {
    public int singleNumber(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int sum=0;
        int comp=0;
        for(int x : arr){
             if(!set.contains(x))comp+=x;
            set.add(x);
           
            sum+=x;
        }
        int comp2=sum-comp;
        return comp-comp2 ;
        
    }
}