class Solution {
    public int lengthOfLastWord(String s) {
        int ans=0;
        char[] ch=s.toCharArray(); 
        boolean flag=true;
        for(int i=s.length()-1;i>=0;i--){
            if(ch[i]==' ' && flag==false){
                break;
            }
            else if(ch[i]!=' '){
                flag =false;
                ans++;
            }
            
        }
        return ans;
    }
}