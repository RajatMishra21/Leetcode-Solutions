//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;


// } Driver Code Ends
    

class Solution
{
public:
    // arr: input array
    // n: size of array
    // Function to rearrange an array so that arr[i] becomes arr[arr[i]]
    // with O(1) extra space.

    void arrange_cycle(long long arr[], int n, int curr_ind)
    {
        int want_ind,ele;
        int start_ind = curr_ind;
        int start = arr[start_ind];
        //  start is the element from where we enter the cycle
        while (true)
        {
            // our curr element at the position
            ele = arr[curr_ind];

            // index of the element that is to be filled at curr_ind
            // ex- {4,3,0,1}
            // our curr_ind = 0; want_ind = arr[curr_ind] = 4;
            
            want_ind = arr[curr_ind];

            
            // this condition checks the end of cycle and if the arr requires no change for this ind;
            if (want_ind == start_ind)
            {
    
                arr[curr_ind] = start + n;
                return;
            }

            //  now do the op
            arr[curr_ind] = arr[want_ind] + n;
            
            // here we are adding +n to the eleemnt so that we 
            // dont enter the cycle from any other node

            // move curr_ind to index of the element that put at our current index;
            // that index is equal to our current element
            // ex- if {4,2,0,1}
            // if arr[0] = arr[arr[0]] = arr[4] =1;
            // 1 will be put at 0,our current index; now our curr_ind move to index of "1" means 4
            // you will notice 4 was also the element that was at our elemt before the swap
            
            curr_ind = ele;
        }
    }
    void arrange(long long arr[], int n)
    {
        // Your code here
        
        for(int i=0; i<n;i++){

            if(arr[i] < n){
                arrange_cycle(arr,n,i);
            }
        }
        for(int i=0; i<n;i++){
            arr[i] -=n;
        }

        
    }
};


//{ Driver Code Starts.

int main(){
    
    int t;
    //testcases
    cin>>t;
    while(t--){
        
        int n;
        //size of array
        cin>>n;
        long long A[n];
        
        //adding elements to the array
        for(int i=0;i<n;i++){
            cin>>A[i];
        }
        Solution ob;
        //calling arrange() function
        ob.arrange(A, n);
        
        //printing the elements 
        for(int i=0;i<n;i++){
            cout << A[i]<<" ";
        }
        cout<<endl;
    }
    return 0;
}
// } Driver Code Ends