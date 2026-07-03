class Solution {
    public List<List<Integer>> subsets(int[] arr) {
        int n = arr.length;
        List<List<Integer>> ls = new ArrayList<>();
        backtrack(arr,0,ls,new ArrayList<>());
        return ls;
        
    }
    public void backtrack (int[] arr , int id ,List<List<Integer>>ans , List<Integer> ls){
        if(id == arr.length){
            ans.add(new ArrayList<>(ls));
            return;
        }
        ls.add(arr[id]);
        backtrack(arr, id+1, ans ,ls);
        ls.remove(ls.size()-1);
        backtrack(arr, id+1, ans ,ls);

    }

   
}