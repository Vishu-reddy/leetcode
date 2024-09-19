class Solution {
    public boolean isValid(String S) {
        Stack<Character> st=new Stack<>();
        for(char s:S.toCharArray()){
            if(s=='('||s=='['||s=='{'){
                st.push(s);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                if((s==')' && st.peek()!='(')||
                    (s==']' && st.peek()!='[')||
                    (s=='}' && st.peek()!='{')){
                    return false;
                }
                st.pop();
            }
        }
        return st.isEmpty();
    }
}