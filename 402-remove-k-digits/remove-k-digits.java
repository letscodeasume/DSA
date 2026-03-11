class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<num.length();i++){
            char ch=num.charAt(i);
            // remove k element from left
            while(!st.isEmpty() && k>0 && st.peek()>ch){
                st.pop();
                k--;
            }
            st.push(ch);
        }
        // remove k element from right
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            if(k>0){
                st.pop();
                k--;
            }else{
                sb.insert(0,st.pop());
            }
        }
        while(sb.length()>0 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
        return (sb.length()==0) ? "0" : sb.toString();
    }
}