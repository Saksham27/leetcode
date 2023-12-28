class Solution {
    public int[] buildArray(int[] nums) {
        int[] finalArr = new int[nums.length];

        for(int i=0; i< nums.length; i++){
            finalArr[i] = nums[nums[i]];
        }
        return finalArr;
    }
}