#User function Template for python3

class Solution:
    def countSubArrayProductLessThanK(self, a, n, k):

    
        ans=0
        l=0
        r=0
        prod=1
        while r<n:
            prod*=a[r]
            while prod>=k and l<=r:
                prod/=a[l]
                l+=1
            if l<=r:
                lenght=r-l+1
                ans+=lenght
            r+=1
        return ans

    
    


#{ 
 # Driver Code Starts

#Initial Template for Python 3

def main():

    T = int(input())

    while(T > 0):
        n, k = [int(x) for x in input().strip().split()]
        arr = [int(x) for x in input().strip().split()]
        
        print(Solution().countSubArrayProductLessThanK(arr, n, k))

        T -= 1


if __name__ == "__main__":
    main()


# } Driver Code Ends