class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        HashSet < Integer > hash = new HashSet < Integer > ();
  for (int i = 0; i < n; i++) {
    hash.add(nums[i]);
  }
  for (int i = 1; i <= n + 1; i++) {
    if (!hash.contains(i)) {
      return i;
    }
  }
  return -1;  // Your code here
    }
        
   }
