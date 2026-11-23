class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dest, int k) {
        //Create a dag
        ArrayList<ArrayList<int[]>> adj= new ArrayList<>();
        for( int i = 0 ; i <n ; i++)adj.add(new ArrayList<>());

        for(int[] flight : flights){
            int u = flight[0];
            int v = flight[1];
            int w = flight[2];
            adj.get(u).add( new int[]{v,w});
        }
        PriorityQueue<int[]> q = new PriorityQueue<>((a,b)-> Integer.compare(a[1],b[1]));
        int[][] dist = new int[k+2][n];
        for(int[] row : dist){
        Arrays.fill(row,(int)(1e9));
        }
        dist[0][src]=0;
        q.offer(new int[]{src,0,0});
        while(!q.isEmpty()){
            
                int[] curr = q.poll();

                if(curr[2]==k+1)continue;
                

                for( int[] nodes : adj.get(curr[0])){
                   
                        if(dist[curr[2]+1][nodes[0]]>curr[1]+nodes[1] ){
                            dist[curr[2]+1][nodes[0]] = curr[1]+nodes[1];
                             
                            q.offer( new int[]{nodes[0], dist[curr[2]+1][nodes[0]],curr[2]+1});
                        }
                    

                
            }
        }

        int ans = (int)(1e9);
        for( int i = 0 ; i < k+2 ; i++){
            ans = Math.min(ans, dist[i][dest]);
        }
        return ans==(int)(1e9)?-1:ans;
        
    }
}