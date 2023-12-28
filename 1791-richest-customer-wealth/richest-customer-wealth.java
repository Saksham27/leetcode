class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for(int[] customer : accounts){
            int custWealth = 0;
            for(int wealth : customer){
                custWealth += wealth;
            }
            if(maxWealth < custWealth)
                maxWealth = custWealth;
        }
        return maxWealth;
    }
}