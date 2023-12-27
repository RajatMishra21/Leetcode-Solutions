class Solution {
    public boolean isPalindrome(int n) {
        int dup=n;
        int rev=0;
        boolean res=false;
        while(n>0){
            int last=n%10;
            rev=(rev*10)+last;
            n=n/10;
        }
        if(rev==dup)
            res=true;
            
       return res;
    }
}