class Solution {
    public int[] intersection(int[] arr1, int[] arr2) {
      boolean[] seen = new boolean[10001];
      Set<Integer> set = new HashSet<>();

      for(int x:arr1)seen[x]=true;
      for(int y:arr2){
        if(seen[y]==true){
            set.add(y);
        }
      }
      int[] ans = new int[set.size()];
      int j=0;
      for(Integer z : set){
        ans[j++]=z;
      }
      return ans;
    }
}