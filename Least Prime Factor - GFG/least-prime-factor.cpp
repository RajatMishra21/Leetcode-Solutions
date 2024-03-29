//{ Driver Code Starts
// Initial Template for C++
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
// User function Template for C++
class Solution {
    vector<int> primes;
public:
    void sieveOfErathosnes(int n) {
        vector<bool> isPrime(n, 1);
        isPrime[0] = isPrime[1] = false;
        
        for(int i = 2; i <= sqrt(n); i++) {
            if(isPrime[i]) {
                for(int j = i * i; j <= n; j += i)
                    isPrime[j] = false;
            }
        }
        
        for(int i = 0; i <= n; i++) 
            if(isPrime[i]) primes.push_back(i);
    }
  
    vector<int> leastPrimeFactor(int n) {
        
        vector<int> temp(n + 1);
        temp[0] = 0;
        temp[1] = 1;
        sieveOfErathosnes(n);
        
        for(int i = 2; i <= n; i++) {
            for(int j = 0; j < primes.size(); j++) {
                if(i % primes[j] == 0) {
                    temp[i] = primes[j];
                    break;
                }
            }
        }
        
        return temp;
    }
};

//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        Solution ob;
        vector<int>ans = ob.leastPrimeFactor(n);
        for(int i=1;i<=n;i++)cout<<ans[i]<<" ";
        cout<<endl;  
    }
    return 0;
}

// } Driver Code Ends