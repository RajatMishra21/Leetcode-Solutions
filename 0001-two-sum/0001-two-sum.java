class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int [] result=new int[2];
        Map map=new HashMap();
        for(int i=0; i<numbers.length;i++){
            if(!map.containsKey(target-numbers[i])){
                map.put(numbers[i],i);
            }
            else{
                result[1]=i;
                result[0]=(int)map.get(target-numbers[i]);
                return result;
            }
        }
        
        return result;
    }
}