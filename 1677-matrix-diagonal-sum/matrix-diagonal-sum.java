class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
       for(int i=0;i<mat.length;i++){
           for(int j=0;j<mat.length;j++){
               if(i==j){
                   sum+=mat[i][j];
               }
           }
       }

       for(int i=0;i<mat.length;i++){
           for(int j=0;j<mat.length;j++){
               if(i==j){
                   sum+=mat[i][mat.length-1-j];
               }
           }
       }

       if((mat.length-1)%2==0){
           sum = sum - mat[(mat.length-1)/2][(mat.length-1)/2];
       }
       return sum;
    }
}