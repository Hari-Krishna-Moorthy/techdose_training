// URL : https://leetcode.com/problems/implement-stack-using-queues/

import java.util.Deque;
import java.util.ArrayDeque;

class MyStack {

    Deque<Integer> q;
    public MyStack() {
        q = new ArrayDeque<>();
    }
    
    public void push(int x) {
        q.addLast(x);
    }
    
    public int pop() {
        if(q.size()>0) return q.pollLast();
        return 0;
    }
    
    public int top() {
        return q.peekLast();
    }
    
    public boolean empty() {
        if(q.size()>0) return false;
        return true;
    }
}