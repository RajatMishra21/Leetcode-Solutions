class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int res=0;
        for(char j:jewels.toCharArray()){
            for(char s:stones.toCharArray()){
                if(s==j){
                    res++;
                }
            }
     
        }
        return res;
    }
    
}