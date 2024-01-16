class Solution {
    public int searchInsert(int[] nums, int target) {
        int length = nums.length;
        int start = 0;
        int end = length-1;
         int mid = 0;
        if(target == nums[start]){
                return start;
        }

        while(start<=end){
            mid = start + (end-start)/2;
                 
            if(nums[mid] == target){
                    return mid;
            }else if(nums[mid]> target){
                   
                end = mid-1;
            }else{
                    
                start = mid+1;
            }
               
        }
            if(target<nums[mid])
                return mid;
            else
            return mid+1;
          

    }
}