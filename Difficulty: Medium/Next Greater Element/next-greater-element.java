class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++)
            res.add(-1);
            
        Deque<Integer> stack = new ArrayDeque<>();
        
        for(int i = arr.length-1 ; i >= 0 ; i--){
            while(!stack.isEmpty() && stack.peek() <= arr[i])
                stack.pop();
            
            if(!stack.isEmpty())
                res.set(i,stack.peek());
                
            stack.push(arr[i]);
        }  
        
        
        return res;
    }
}