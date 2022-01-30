// URL : https://leetcode.com/problems/min-stack/

class MinStack {
    Stack<Integer> stk = null;
    Integer min; 

    public MinStack() {
        stk = new Stack<Integer>();
        min = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        if(val < min) 
            min = val;
        stk.push(val);
    }
    
    public void pop() {
        // System.out.println(stk + " " + stk.peek() + " " + min + " " + (stk.peek().equals(min)));
        if(stk.peek().equals(min)) {
            stk.pop();
            if(stk.empty()) {
                min = Integer.MAX_VALUE;
                return;
            }
            min = Collections.min(this.stk);
            return ;
        }
        stk.pop();
    }
    
    public int top() {
        return stk.peek();
    }
    
    public int getMin() {
        return this.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */