class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr={-1,-1};
        int l=0,r=nums.length-1;
		
		//finding the first target element
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==target){
                arr[0]=mid;
                r=mid-1;
            }
            else if(nums[mid]<target){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        l=0;
        r=nums.length-1;
		
		//finding the last target element
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==target){
                arr[1]=mid;
                l=mid+1;
            }
            else if(nums[mid]<target){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return arr;
    }
}