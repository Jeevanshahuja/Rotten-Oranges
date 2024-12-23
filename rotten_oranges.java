class Solution {
    public int orangesRotting(int[][] grid) {
        int ans=0;
        int m=grid.length;
        int n=grid[0].length;
        int fresh=0;
        Queue<int[]> q= new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                }
                if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        if(fresh==0){
            return 0;
        }
        int [][] direction={ { 0, 1 }, { 1, 0 }, { -1, 0 }, { 0, -1 } };
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                int[] curr=q.poll();
                int row=curr[0];
                int col=curr[1];
                for(int[] dir: direction){
                    int newrow=row+dir[0];
                    int newcol=col+dir[1];
                    if(newrow>=0 && newrow<m && newcol>=0 && newcol<n && grid[newrow][newcol]==1){
                        q.add(new int[]{newrow,newcol});
                        grid[newrow][newcol]=2;
                    }
                }
            }
            ans++;
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    return -1;
                }
            }
        }
        return ans-1;
    }
}