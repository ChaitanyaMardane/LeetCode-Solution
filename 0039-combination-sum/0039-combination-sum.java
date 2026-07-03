class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
         List<List<Integer>> ls= new ArrayList<>();
        cSum(candidates,0,ls,new ArrayList<Integer>(),0,target);
        return ls;
    }
    public static  void cSum(int[] arr,int id,List<List<Integer>> ls,List<Integer> ans,int sum,int k){
        if(sum==k){
            ls.add(  new ArrayList<Integer>(ans));
            return ;
        }
        if(sum>k || id>=arr.length)return ;

        ans.add(arr[id]);
        cSum(arr,id,ls,ans,sum+arr[id],k);
        ans.remove(ans.size()-1);
    
        cSum(arr,id+1,ls,ans,sum,k);
    }
}