class MinStack {
    
    private Stack<Integer> mainStack;
    private Stack<Integer> minStack;

    public MinStack() {
        this.mainStack = new Stack();
        this.minStack = new Stack();
    }
    
    public void push(int val) {
        if (minStack.isEmpty() || minStack.peek() >= val) {
            minStack.push(val);
        }
        mainStack.push(val);
    }
    
    public void pop() {
        int value = mainStack.pop();
        if (!minStack.isEmpty() && minStack.peek() == value) {
            minStack.pop();
        }
    }
    
    public int top() {
        return mainStack.peek();
    }
    
    public int getMin() {
        return minStack.isEmpty() ? mainStack.peek() : minStack.peek();
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