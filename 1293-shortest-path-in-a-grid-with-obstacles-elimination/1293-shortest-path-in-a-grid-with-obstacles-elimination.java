class Solution {
    public int shortestPath(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int[] dr = { 0, 0, 1, -1 };
        int[] dc = { 1, -1, 0, 0 };
        Queue<int[]> q = new ArrayDeque<>();
        q.offer(new int[] { 0, 0, 0, k });
        int[][] vis = new int[m][n];

        for (int[] row : vis) {
            Arrays.fill(row, -1);
        }

        vis[0][0] = k;
        while (!q.isEmpty()) {
            System.out.println(q.size());
            int[] curr = q.poll();
            int r = curr[0];
            int c = curr[1];
            int dist = curr[2];

            if (r == m - 1 && c == n - 1)
                return dist;

            for (int i = 0; i < 4; i++) {
                int nr = r + dr[i], nc = c + dc[i];
                if (nr >= 0 && nr < m && nc >= 0 && nc < n) {
                    // if(nr==m-1 && nc == n-1) return dist+1;
                    int newK = curr[3] - grid[nr][nc];
                    if (newK >= 0 && newK > vis[nr][nc]) {

                        vis[nr][nc] = newK;

                        q.offer(new int[] {
                                nr, nc, dist + 1, newK
                        });
                    }
                }
            }

        }
        return -1;

    }
}