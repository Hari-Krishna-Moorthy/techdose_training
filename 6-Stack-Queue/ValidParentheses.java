import java.util.Stack;

class ValidParentheses {
	public static boolean isValid(String s) {
        Stack<Character> stk = new Stack<Character>();
        for(Character ch : s.toCharArray()) {
            if(ch=='(' || ch=='{' || ch=='[') 
                stk.push(ch);
            else if((ch==')'&& stk.peek()=='(') 
                    || (ch=='}'&&stk.peek()=='{') 
                    ||(ch==']'&&stk.peek()=='[') )
                stk.pop();
            else 
                return false;
        } 
        return stk.empty();
    }
    public static void main(String[] args) {
    	System.out.println(isValid("()"));
    	System.out.println(isValid("()[]{}"));
    	System.out.println(isValid("(]"));
    	System.out.println(isValid("("));
    }
}


