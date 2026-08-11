class Solution {
    public int[] intersection(int[] arr1, int[] arr2) {
        int[] arr = arr1.length>arr2.length?arr1:arr2;
        Set<Integer> set1  = new HashSet<>();
        Set<Integer> ans  = new HashSet<>();

        for(int i =0; i<arr1.length;i++){
            set1.add(arr1[i]);
        }
         for(int i =0; i<arr2.length;i++){
            if(set1.contains(arr2[i]))ans.add(arr2[i]);
        }
        int[] result = new int[ans.size()];
        int j =0;
        for(Integer x: ans){
            result[j++]=x;
        }
        return result;
    }
}