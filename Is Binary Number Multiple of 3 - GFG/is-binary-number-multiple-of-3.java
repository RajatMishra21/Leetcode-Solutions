//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out=new PrintWriter(System.out);
            int t = Integer.parseInt(in.readLine().trim());
            while(t-->0)
                {
                    String s = in.readLine().trim();
                    Solution ob = new Solution();
                    out.println(ob.isDivisible(s));
                }
                out.close();
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution {
    int isDivisible(String s) {
        // code here
        int len = s.length()-1;
        int mod = 3;
        int num = 0;
        int pow = 1;
        for( int i=len; i >= 0; i--){
            pow = (pow*2)%mod;
            if((s.charAt(i)) == ('1')){
                num += pow%mod;
            }
        }
        if(num%3 == 0){
            return 1;
        }
        return 0;
    }
}