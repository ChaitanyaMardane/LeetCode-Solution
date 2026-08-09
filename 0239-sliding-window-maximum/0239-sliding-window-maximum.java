class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        Deque<Integer> que = new LinkedList<>();
        if(k==1)return arr;
        int j =0;
        int[] ans= new int[arr.length-k+1];
        // for( int m=0; m<k;m++){
        //      while(!que.isEmpty()&&  arr[m]>=arr[que.peekFirst()]) que.pollFirst();
        //      que.offerLast(m);
        // }
        for( int i=0; i< arr.length && j<ans.length ; i++){
            
            while(!que.isEmpty()&& que.peekFirst()< i-k+1) que.pollFirst();
            while(!que.isEmpty()&& arr[i]>=arr[que.peekLast()])que.pollLast();
             
            que.offerLast(i);
            if(i-k+1==j) ans[j++]=arr[que.peekFirst()];
            
    
        }
        return ans;
    }
    //O(nk)
    /*
        if(k==1) return arr;
        ArrayList<Integer> ls = new ArrayList<>();
        int j = 0 , n = arr.length;
       LinkedList<Integer> map = new LinkedList<>(); 
        int max=0;
        for( int i = 0; i < k ; i++){
            max= Math.max(max,arr[i]);
            map.add(arr[i]);
        } 
        ls.add(max);
        
        for( int i =k ; i < n  && j<n; i++){
            map.removeFirst();
            j++;
            map.addLast(arr[i]);
            if(map.contains(max)){
                System.out.println(max +" present in set");
               max= arr[i]>=max?arr[i]:max;
            }else{
                System.out.println(max +" not present in set");

                max=arr[i]>=max?arr[i]:map.stream()
                 .mapToInt(Integer::intValue)
                 .max()
                 .orElse(0);
            }
            ls.add(max);
        }
        return ls.stream().mapToInt(Integer::intValue).toArray();
    */
}