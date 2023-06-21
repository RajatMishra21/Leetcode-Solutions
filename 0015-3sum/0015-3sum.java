class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>>res=new HashSet<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n;i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=nums[j]+nums[k];
                if(sum==-nums[i]){
                    res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                }
                else if(sum>-nums[i])
                    k--;
                else if(sum<-nums[i])
                    j++;

            }
        }
        return new ArrayList<>(res);
    }
}