import java.util.Stack;
import java.util.HashMap;

class ValidParentheses {
	static public boolean isValid(String s) {
        Stack<Character> stk = new Stack<Character>();
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		
		map.put(')', '(');        
		map.put('}', '{');        
		map.put(']', '[');

        for(Character ch : s.toCharArray()) {
            if(ch == '(' || ch == '{' || ch == '[') {
                stk.push(ch);
            } else {
            	if(stk.empty() || map.get(ch) != stk.pop()) return false;
            }


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


