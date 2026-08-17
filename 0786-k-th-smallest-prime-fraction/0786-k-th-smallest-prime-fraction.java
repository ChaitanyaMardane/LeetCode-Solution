class Solution {
    class Pair implements Comparable<Pair>{
        int a , b;
        public Pair( int a , int b){
            this.a= a ;
            this.b=b;
        }
      
        public int compareTo(Pair p){
            return this.a*p.b-this.b*p.a; 
        }
    }
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        PriorityQueue<Pair> q = new PriorityQueue<>(Collections.reverseOrder());
        int n=arr.length;
        for(int i = 0 ; i <n; i++){
            for( int j = i+1 ; j < n ; j++){
            q.add(new Pair(arr[i],arr[j]));
                while(q.size()>k){
                    q.poll();
                }
            }
        }
        Pair p= q.poll();
        return new int[]{p.a,p.b};     
    }
}