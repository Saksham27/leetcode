class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index=0;
        switch(ruleKey){
            case "type":
                index = 0;
                break;
            case "color":
                index = 1;
                break;
            case "name":
                index = 2;
                break;
            default :
                
        }
        int count = 0;
        
        for(int i=0;i<items.size();i++){

            if(items.get(i).get(index).equals(ruleValue)){
                count++;
            }
                
        }
        return count;
    }
}