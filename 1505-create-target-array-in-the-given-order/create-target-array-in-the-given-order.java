class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[index.length];
        for(int i=0;i<nums.length;i++){
           if(index[i]<i){
               insertElementToIndex(target,index[i],nums[i]);
           }else{
            
               target[index[i]] = nums[i];
           }
        }
        return target;
    }

    public void insertElementToIndex(int[] arr, int index, int element){
        arr[arr.length-1] = arr[arr.length-2];
        for(int i=arr.length-2;i>index;i--){
            arr[i] = arr[i-1];
        }
        arr[index] = element;
    }
}