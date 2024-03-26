class Solution {
    public void moveZeroes(int[] nums) {
        int j = -1;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                if (j == -1) {
                    j = i; // Update j only if it's the first zero encountered
                }
            } else if (j != -1) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}
