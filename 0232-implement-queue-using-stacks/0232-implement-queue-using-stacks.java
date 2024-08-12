class MyQueue {

    private final Stack<Integer> mainStack = new Stack<>();
    private final Stack<Integer> tempStack = new Stack<>();
    
    public MyQueue() {
        
    }
    
    public void push(int x) {
        for (int i = 0, iLimit = mainStack.size(); i < iLimit; ++i) {
            this.tempStack.push(mainStack.pop());
        }
        this.mainStack.push(x);
        for (int i = 0, iLimit = tempStack.size(); i < iLimit; ++i) {
            this.mainStack.push(tempStack.pop());
        }
    }

    public int pop() {
        return this.mainStack.pop();
    }

    public int peek() {
        return this.mainStack.peek();
    }

    public boolean empty() {
        return this.mainStack.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */