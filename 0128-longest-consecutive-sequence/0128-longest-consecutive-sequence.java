class Solution {
     
        public int longestConsecutive(int[] nums) {
        HashMap<Integer, Boolean> hm = new HashMap<>();
        int ans = 0;
        for(int n:nums){       // Putting all element true
            hm.put(n,true);
        }
        
        for(int n : nums){  //placing false if n-1  present
            if(hm.containsKey(n-1)){
                hm.replace(n,false);
            }
        }
        
        for(int n : nums){
            if(hm.get(n)) {  //it return true
                int len=1;
                while(hm.containsKey(n + len)){  // for cheacking if consecative ele present or not
                    len++;
                }
                if(ans<len){
                    ans = len;
                }
            }            
        }
        return ans;
    }
    }
