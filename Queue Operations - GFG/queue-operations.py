#User function Template for python3
class Solution:
    def insert(self, q, k): 
        q.append(k)
     
    def findFrequency(self, q, k):
        freq = 0
        for ele in q:
            if ele == k:
                freq+=1
        return freq
          # code here


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__': 
    t = int(input())
    for _ in range(t):
        obj = Solution()
        q = []
        n = int(input())
        arr = list(map(int, input().strip().split()));
        for k in arr:
            obj.insert(q,k)
        
        
        m = int(input())
        query = list(map(int, input().strip().split()));
        for k in query:
            f = obj.findFrequency(q,k)
            if f!=0:
                print(f)
            else:
                print(-1)

# } Driver Code Ends