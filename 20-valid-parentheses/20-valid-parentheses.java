class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            if(st.isEmpty()){
                st.push(curr);
            }
            else{
                char p=st.peek();
                if( p=='('&&  curr==')'){
                    st.pop();
                }
                else if( p=='{'&&  curr=='}'){
                    st.pop();
                }
                else if( p=='['&&curr==']'){
                    st.pop();
                }
                else{
                    st.push(curr);
                }
            }
            
        }
        if(st.isEmpty())
            return true;
        else
            return false;
    }
    
}