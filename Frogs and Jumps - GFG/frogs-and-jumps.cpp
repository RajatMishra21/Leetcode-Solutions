//{ Driver Code Starts
// Initial Template for C++
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
//User function Template for C++

class Solution {
  public:
      int unvisitedLeaves(int n, int leaves, int frogs[]) {
        unordered_map<int,int> mp;
        sort(frogs,frogs+n);
        for(int i=0;i<n;i++){
            int num=frogs[i];
            if(mp.find(num)==mp.end()){
                while(num<=leaves){
                    mp[num]=1;
                    num+=frogs[i];
                }
            }
        }
        return leaves-mp.size();
    }
};


//{ Driver Code Starts.


int main() {
    int t;
    cin >> t;
    while (t--) {
        int N, leaves;
        cin >> N >> leaves;
        int frogs[N];
        for (int i = 0; i < N; i++) {
            cin >> frogs[i];
        }

        Solution ob;
        cout << ob.unvisitedLeaves(N, leaves, frogs) << endl;
    }
}
// } Driver Code Ends