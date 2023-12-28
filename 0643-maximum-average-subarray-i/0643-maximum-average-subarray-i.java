class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(nums.length==1){
            return (double)nums[0]/k;
        }
        int i=0;
        int j=0;
        double res=Integer.MIN_VALUE;
        double avg=0.0;
       
        while(j<nums.length){
            avg+=nums[j];
           
          
            if(j-i+1==k){
                 res=Math.max(res,avg);
                avg-=nums[i];
                i++;
               
            }
             j++;
            
            
        }
        return res/k;
        
    }
}