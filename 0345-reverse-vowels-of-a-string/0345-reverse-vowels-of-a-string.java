class Solution {
    public String reverseVowels(String s) {
        char arr[]=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(!isv(arr[i])){
                i++;}
            else if(!isv(arr[j])){
                j--; }
            else{
                 char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
                i++;
                j--;
            }
        }
       
        String res=new String(arr);
        return res;
        
        
    }
       public static boolean isv(char ch) {
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            return true;
        }
        return false;
   
    }
}
