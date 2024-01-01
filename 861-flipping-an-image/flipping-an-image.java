class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] arr = new int[image.length][image.length];
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image.length;j++){
                if(image[i][j] == 0){
                    arr[i][image.length-1-j] = 1;
                }else{
                    arr[i][image.length-1-j] = 0;
                }
            }
        }
        return arr;
    }
}