class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] arr = new int[m][n];
        int count = 0;

        for(int i=0;i<indices.length;i++){
            for(int j=0;j<n;j++){
                arr[indices[i][0]][j] +=1; 
            }
            for(int l=0;l<m;l++){
                arr[l][indices[i][1]] +=1; 
            }
        }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if((arr[i][j])%2 != 0){
                    
                    count++;
                }
            }
        }
        return count;
    }
}