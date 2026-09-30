class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack <>();
        for(String k : tokens){
            if (k.equals("+")){
                int a = st.pop();
                int b =st.pop();
                st.push(b+a);

            }
            else if (k.equals("-")){
                int a = st.pop();
                int b =st.pop();
                st.push(b-a);

            }
        else if  (k.equals("*")){
                int a = st.pop();
                int b =st.pop();
                st.push(b*a);

            }
            else if (k.equals("/")){
                int a = st.pop();
                int b =st.pop();
                st.push(b/a);

            }
            else{
                st.push(Integer.parseInt(k));
            }


        }
        return st.peek();
    }
}