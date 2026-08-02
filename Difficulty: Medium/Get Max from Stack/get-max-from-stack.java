class SpecialStack {
	Stack<Long> stack;
	long max;
	public SpecialStack() {
		stack = new Stack<>();
		max = Long.MIN_VALUE;
	}
	
	public void push(int x) {
		long val = (long)x;
		
		if (stack.isEmpty()) {
			stack.push(val);
			max = val;
		}
		
		else {
			if (val > max) {
				long curr = 2 * val - max;
				stack.push(curr);
				max = val;
			}
			else
			    stack.push(val);
		}
		
	}
	
	public void pop() {
	    if(stack.isEmpty()) return;
		// Remove the top element from the Stack
		if (stack.peek() > max) {
			max = 2 * max - stack.peek();
		}
		stack.pop();
	}
	
	public int peek() {
		// Returns top element of the Stack
		if(stack.isEmpty()) return -1;
		long x = stack.peek();
		return x > max ? (int)max : (int)x;
	}
	
	boolean isEmpty() {
		// Check if the stack is empty
		return stack.isEmpty();
	}
	
	public int getMax() {
		// Finds maximum element of Stack
		if(stack.isEmpty()) return -1;

		return (int)max;
	}
}
