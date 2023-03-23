//{ Driver Code Starts
//Initial Template for C++
#include <bits/stdc++.h>
using namespace std;
#define MAX_HEIGHT 100000

// Tree Node
struct Node {
    int data;
    Node *right;
    Node *left;

    Node(int x) {
        data = x;
        right = NULL;
        left = NULL;
    }
};

Node *insert(Node *tree, int val) {
    Node *temp = NULL;
    if (tree == NULL) return new Node(val);

    if (val < tree->data) {
        tree->left = insert(tree->left, val);
    } else if (val > tree->data) {
        tree->right = insert(tree->right, val);
    }

    return tree;
}


// } Driver Code Ends
//User function Template for C++

class Solution{
public:
    void solve(Node*ans,int &lind,vector<int>&sum2){
        if(ans==NULL){
            return;
        }
        if(ans->left==NULL && ans->right==NULL){
            sum2.push_back(lind);
        }
        if(ans->left!=NULL){
            lind=lind+ans->left->data;
            solve(ans->left,lind,sum2);
             lind=lind-ans->left->data;
        }
        
        if(ans->right!=NULL){
            lind=lind+ans->right->data;
            solve(ans->right,lind,sum2);
             lind=lind-ans->right->data;
        }
    }


    void find(Node*root,int target,int &sum,Node*&ans,int &flag){
    if(root==NULL){
            return;
        }
        if(root->data==target){
            ans=root;
            flag=-1;
            return ;
        }
        sum=sum+ root->data;
        if(root->data <target){
            find(root->right,target,sum,ans,flag);
        }
        else{
            find(root->left,target,sum,ans,flag);
        }
        
    }

    int maxDifferenceBST(Node *root,int target){
        int sum=0;
        vector<int>sum2;
        int lind=0;
        int flag=0;
        int o=0;
        int k=INT_MAX;
        Node*ans=root;
        find(root,target,sum,ans,flag);
        if(flag==0){
            return -1;
        }
        if(ans->left==NULL && ans->right==NULL){
            return sum;
        }
        solve(ans,lind,sum2);
        for(int i=0;i<sum2.size();i++){
            k=min(k,sum2[i]);
        }
       return sum-k;
        
    }
};

//{ Driver Code Starts.

int main() {
    int T;
    cin >> T;
    while (T--) {
        Node *root = NULL;

        int N;
        cin >> N;
        for (int i = 0; i < N; i++) {
            int k;
            cin >> k;
            root = insert(root, k);
        }

        int target;
        cin >> target;
        Solution ob;
        cout << ob.maxDifferenceBST(root, target);
        cout << endl;
    }
}
// } Driver Code Ends