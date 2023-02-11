class Solution {
    public int trap(int[] height) {
        int leftmax=0, rightmax=0, ans=0;
        int left = 0;
        int right = height.length-1;
        if(height.length <= 2){
            return 0;
        }
        while(left < right){
            if(height[left] < height[right]){
                if(height[left] < leftmax){
                    ans += (leftmax - height[left]);
                }else{
                    leftmax = height[left];
                }
                left += 1;
            }else{
                if(height[right] < rightmax){
                    ans += (rightmax - height[right]);
                }else{
                    rightmax = height[right];
                }
                right -= 1;
            }
        }
        return ans;
    }
}