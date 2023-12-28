class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        int len =candies.length;
        List<Boolean> result = new ArrayList<Boolean>(len);
        for(int i=1;i<len;i++){
            if(candies[i]> max){
                max = candies[i];
            }
        }

        for(int i=0;i<len;i++){
            if(candies[i]+extraCandies >= max){
                result.add(i,true);
            }else{
                 result.add(i,false);
            }
        }


        return result;
    }
}