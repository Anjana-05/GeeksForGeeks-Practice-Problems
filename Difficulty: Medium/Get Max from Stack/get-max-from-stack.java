class SpecialStack {
    Stack<Integer> stack; 
    Stack<Integer> maxStack;
    public SpecialStack() {
        stack = new Stack<>();
        maxStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        
        if(maxStack.isEmpty() || x >= maxStack.peek())
            maxStack.push(x);
        
    }

    public void pop() {
        if(stack.isEmpty()) return;
        // Remove the top element from the Stack
        if(stack.peek().equals(maxStack.peek())){
            maxStack.pop();
        }
        stack.pop();
    }

    public int peek() {
        // Returns top element of the Stack
        if(stack.isEmpty()) return -1;
        return stack.peek();
    }

    boolean isEmpty() {
        // Check if the stack is empty
        return stack.isEmpty();
    }

    public int getMax() {
        // Finds maximum element of Stack
        if(maxStack.isEmpty()) return -1;
        return maxStack.peek();
    }
}