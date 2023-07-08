class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int count =0,flag=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                count++;
                
            }
            else {
                count=0;
            }
            flag=Math.max(count,flag);
        }
        return flag;
    }
}