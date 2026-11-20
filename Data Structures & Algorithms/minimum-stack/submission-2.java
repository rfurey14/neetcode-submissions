class MinStack {
    private Stack<Integer>currMin; //tracks the current minimum up to this point
    private Stack<Integer>stack;

    public MinStack() {
        stack = new Stack<>();
        currMin = new Stack<>();
    }
    
    public void push(int val) {
        if (currMin.isEmpty()){
            currMin.push(val);
            stack.push(val);
        }else{
        int min = currMin.peek();
        if (val < min){
            currMin.push(val);
        }else{
            currMin.push(min);
        }
        stack.push(val);
    }
    }
    
    public void pop() {
        currMin.pop();
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return currMin.peek();
        
    }
}
