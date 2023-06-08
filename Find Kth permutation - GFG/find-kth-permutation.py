#{ 
 # Driver Code Starts
#Initial Template for Python 3

# } Driver Code Ends
from typing import List


class Solution:
    def kthPermutation(self, n : int, k : int) -> str:
        # code here
        ans = ''
        fact = [0]*10
        fact[0]=fact[1]=1
        k-=1
        for i in range(2,10):
            fact[i]=fact[i-1]*i
        values = [False]*(n+1)
        for i in range(n):
            rem = n-i-1
            comb = fact[rem]
            up = k//comb
            val = 1
            while (1):
                if not values[val]:
                    if up==0:
                        break
                    up-=1
                val+=1
            k=k%comb
            ans += str(val)
            values[val]=1
        return ans   


#{ 
 # Driver Code Starts.
if __name__=="__main__":
    t = int(input())
    for _ in range(t):
        
        N, K = map(int, input().split())
        
        obj = Solution()
        res = obj.kthPermutation(N, K)
        
        print(res)
        

# } Driver Code Ends