import java.util.Stack;

public class validParantheses{
    public static void main(String[] args){
        
        String str = "[{()}]";
        System.out.println(isValid(str));
    }

    public static boolean isValid(String str){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch=='[' || ch=='{' || ch=='('){
                st.push(ch);

            }
            else{
                if(st.size()==0){
                    return false;
                }
                if(ch==')' && st.peek()=='('){
                    st.pop();
                }
                else if(ch==']' && st.peek()=='['){
                    st.pop();
                }
                else if(ch=='}' && st.peek()=='{'){
                    st.pop();
                }
                else{
                    return false;
                }
            }

        }
        if(st.size()==0){
            return true;
        }
        else{
            return false;
        }
    }
}