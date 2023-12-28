class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] result = new int[2*nums.length];
        int len = nums.length;
        for(int i=0;i<len;i++){
            result[i]=result[i+len]=nums[i];
        }
        System.gc();
        return result;
    }
}