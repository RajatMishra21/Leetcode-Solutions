class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> list=new ArrayList<>();
        List<List<Integer>>result=new ArrayList<>();
        subset(nums,list,result,0);
        return result;    
    }
    public void subset(int nums[],List list,List result,int start){
        if(start==nums.length){
            result.add(new ArrayList<>(list));
            return;
        }
        subset(nums,list,result,start+1);
        list.add(nums[start]);
        subset(nums,list,result,start+1);
        list.remove(list.size()-1);
    }
}