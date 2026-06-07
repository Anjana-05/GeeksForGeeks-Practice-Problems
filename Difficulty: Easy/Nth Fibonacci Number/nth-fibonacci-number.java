class Solution {
    public int nthFibonacci(int n) {
        // code here
        int a = 0;
        int b = 1;
        int i = 0;
        while(i < n){
            int c = a+b;
            a = b;
            b = c;
            i++;
        }
        return a;
    }
}