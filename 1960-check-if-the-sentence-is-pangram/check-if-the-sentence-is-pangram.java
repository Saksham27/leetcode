class Solution {
    public boolean checkIfPangram(String sentence) {
        ArrayList<Character> arr = new ArrayList<Character>();

        for(int i=0;i<sentence.length();i++){
            if(arr.indexOf(sentence.charAt(i)) == -1){
                arr.add(sentence.charAt(i));
            }
        }
        return arr.size() == 26 ? true : false;
    }
}