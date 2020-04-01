import java.util.*;

public class Parenthesis {
    public boolean chkParenthesis(String A, int n) {
        // write code here
        if(n%2!=0){
            return false;
        }
        Stack<Character> s=new Stack<>();
        for (int i = 0; i < A.length(); i++) {
            char c=A.charAt(i);
            if(c=='('){
                s.push(c);
            }else if(c==')'){
                if(s.isEmpty()){
                    return false;
                }else{
                    if(s.peek()=='('){
                        s.pop();
                    }else{
                        return false;
                    }
                }

            }
        }
        return true;
    }
}