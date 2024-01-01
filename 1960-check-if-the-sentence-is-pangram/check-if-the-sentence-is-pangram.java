class Solution {
    public boolean checkIfPangram(String sentence) {
        ArrayList<Character> arr = new ArrayList<Character>();
        char[] chararr = sentence.toCharArray();
        for(int i=0;i<chararr.length;i++){
            if(arr.indexOf(chararr[i]) == -1){
                arr.add(chararr[i]);
            }
        }
        return arr.size() == 26 ? true : false;
    }
}